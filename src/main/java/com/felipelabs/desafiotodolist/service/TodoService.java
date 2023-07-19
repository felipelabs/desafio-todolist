package com.felipelabs.desafiotodolist.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.felipelabs.desafiotodolist.entity.Todo;
import com.felipelabs.desafiotodolist.exception.BadRequestException;
import com.felipelabs.desafiotodolist.repository.TodoRepository;

@Service
public class TodoService {
  
  @Autowired
  TodoRepository todoRepository;

  public List<Todo> list(){
    Sort sort = Sort.by(Direction.DESC, "prioridade");
    return todoRepository.findAll(sort);
  }

  public List<Todo> create(Todo todo){
    todoRepository.save(todo);
    return list();
  }

  public List<Todo> update(Long id, Todo todo) {
    todoRepository.findById(id).ifPresentOrElse((existingTodo) -> {
      todo.setId(id);
      todoRepository.save(todo);
    }, () -> {
      throw new BadRequestException("Todo %d não existe! ".formatted(id));
    });

    return list();

  }

  public List<Todo> delete(long id){
    todoRepository.findById(id).ifPresentOrElse((existingTodo) -> {
      todoRepository.delete(existingTodo);
    }, () -> {
      throw new BadRequestException("Todo %d não existe! ".formatted(id));
    });
    
    return list();
  }
  
}

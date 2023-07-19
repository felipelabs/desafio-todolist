package com.felipelabs.desafiotodolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipelabs.desafiotodolist.entity.Todo;
import com.felipelabs.desafiotodolist.service.TodoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/todos")
public class TodoController {

  @Autowired
  private TodoService todoService;

  @PostMapping()
  public ResponseEntity<List<Todo>> create(@Valid @RequestBody Todo todo){
    return ResponseEntity.status(HttpStatus.OK)
    .body(todoService.create(todo));
  }

  @GetMapping()
  public List<Todo> get(){
    return todoService.list();
  }

  @PutMapping("{id}")
  public List<Todo> update(@PathVariable Long id, @RequestBody Todo todo){
    return todoService.update(id, todo);
  }

    @DeleteMapping("{id}")
    public List<Todo> delete(@PathVariable Long id){
      return todoService.delete(id);
    }
  
}

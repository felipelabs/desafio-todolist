package com.felipelabs.desafiotodolist;

import java.util.ArrayList;
import java.util.List;

import com.felipelabs.desafiotodolist.entity.Todo;

public class TestContains {
  
  public static final List<Todo> TODOS = new ArrayList<>() {
    {
      add(new Todo(1000L, "Felipe Neves", "Curtir", true, 3));
      add(new Todo(1001L, "Felipe Neves", "Comentar", false, 1));
      add(new Todo(1002L, "Felipe Neves", "Compartilhar", true, 2));
      add(new Todo(1003L, "Felipe Neves", "Se Inscrever", false, 2));
      add(new Todo(1004L, "Felipe Neves", "Ativar as Notificações", true, 1));
    }
  };

  public static final Todo TODO = TODOS.get(0);

}

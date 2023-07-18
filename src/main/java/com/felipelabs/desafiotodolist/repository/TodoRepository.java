package com.felipelabs.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipelabs.desafiotodolist.entity.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>{
  
}

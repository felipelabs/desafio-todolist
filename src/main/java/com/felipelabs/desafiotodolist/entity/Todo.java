package com.felipelabs.desafiotodolist.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "todos")
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @NotBlank
  private String nome;
  @NotBlank
  private String descricao;
  private boolean concluido;
  private int prioridade;

  public Todo(Long id, @NotBlank String nome, @NotBlank String descricao, boolean concluido, int prioridade) {
    this.id = id;
    this.nome = nome;
    this.descricao = descricao;
    this.concluido = concluido;
    this.prioridade = prioridade;
  }

  public Todo(String nome,String descricao, boolean concluido, int prioridade) {
    this.nome = nome;
    this.descricao = descricao;
    this.concluido = concluido;
    this.prioridade = prioridade;
  }

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  public boolean isConcluido() {
    return concluido;
  }
  public void setConcluido(boolean concluido) {
    this.concluido = concluido;
  }
  public int getPrioridade() {
    return prioridade;
  }
  public void setPrioridade(int prioridade) {
    this.prioridade = prioridade;
  }    
  
}

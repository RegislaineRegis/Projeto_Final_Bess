package com.techafroback.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name= "tb_usuario")
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="ID")
  private int id;

  @NotEmpty
  @NotNull
  @Size(min = 5, max = 255)
  @Column(name="NOME")
  private String nome;

  @NotEmpty
  @NotNull
  @Size(min = 5, max = 50)
  @Column(name="EMAIL")
  private String email;

  @NotEmpty
  @NotNull
  @Size(min = 5, max = 50)
  @Column(name="SENHA")
  private String senha;

  public Usuario() {
    
  }

  public void setId( int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setNome( String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setEmail( String email) {
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public void setSenha( String senha) {
    this.senha = senha;
  }

  public String getSenha() {
    return senha;
  }

}

package com.techafroback.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name= "tb_usuario")
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @NotBlank(message= "O atributo nome é Obrigatório!!")
  @Size(min = 5, max = 255, message = "O atributo nome deve conter no mínimo 05 e no máximo 255 caracteres")
  private String nome;

  @NotBlank(message= "O atributo email é Obrigatório!!")
  @Size(min = 10, max = 50, message = "O atributo email deve conter no mínimo 10 e no máximo 50 caracteres")
  private String email;

  @NotBlank(message= "O atributo senha é Obrigatório!!")
  @Size(min = 6, max = 50, message = "O atributo senha deve conter no mínimo 06 e no máximo 50 caracteres")
  private String senha;

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

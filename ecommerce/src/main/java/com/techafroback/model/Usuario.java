package com.techafroback.model;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name= "tb_usuario")
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotEmpty
  @NotNull
  @Size(min = 5, max = 255)
  private String nome;

  @NotEmpty
  @NotNull
  @Size(min = 5, max = 50)
  private String email;

  @NotEmpty
  @NotNull
  @Size(min = 5, max = 50)
  private String senha;

  @OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<Produto> produto;

  public Usuario(Long id, String nome, String email, String senha) {
    this.id = id;
    this.nome = nome;
    this.email = email;
    this.senha = senha;
  }

  public void setId( Long id) {
    this.id = id;
  }

  public Long getId() {
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

package com.techafroback.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID")
  private Long id;
  
  @NotEmpty
  @NotNull
  @Size(min = 5, max = 255)
  @Column(name="NOME")
  private String nome;
  
  @NotEmpty
  @Column(name="PRECO")
  private float preco;
  
  @ManyToOne
	@JsonIgnoreProperties ("produto")
	private Categoria categoria;
	
	@ManyToOne
	@JsonIgnoreProperties ("usuario")
	private Usuario usuario;


  public Produto(){
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

  public float getPreco() {
    return preco;
  }

  public void setPreco(float preco) {
    this.preco = preco;
  }

  public Usuario getUsuario() {
		return usuario;
	}

  public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

  public Categoria getProduto() {
		return categoria;
	}

  public void setProduto(Categoria categoria) {
		this.categoria = categoria;
	}
}

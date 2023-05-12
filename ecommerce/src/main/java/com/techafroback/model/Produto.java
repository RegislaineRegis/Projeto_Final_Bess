package com.techafroback.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
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
  private int id;
  
  @NotEmpty
  @NotNull
  @Size(min = 5, max = 255)
  @Column(name="NOME")
  private String nome;
  
  @NotEmpty
  @Column(name="PRECO")
  private float preco;

  @ManyToOne
  @JoinColumn(name = "id_categoria")
  private Categoria categoria;

  @ManyToMany
  @JoinColumn(name = "id_pedido")
  private Pedido pedido;


  public Produto(){
  }
  
  public int getId() {
    return id;
  }
  
  public void setId(int id) {
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
}

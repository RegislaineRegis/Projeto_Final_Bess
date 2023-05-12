package com.techafroback.model;

import javax.xml.crypto.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_pedidos")
public class Pedido {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="ID")
  private int id;

  @NotEmpty
  @NotNull
  @Size(min = 5, max = 255)
  @Column(name="ENDERECO")
  private String endereco;

  @NotEmpty
  @NotNull
  @Column(name="QUANTIDADE")
  private int quantidade;

  @NotEmpty
  @NotNull
  @Column(name="NOME")
  private float total;

  @Column(name = "DATA_ELABORACAO")
  private Data data_elaboracao;

  @OneToMany
  @JoinColumn(name = "id_produto")
  private Produto produto;

  @ManyToOne
  @JoinColumn(name = "id_usuario")
  private Usuario usuario;

  public Pedido(){
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public float getTotal() {
    return total;
  }

  public void setTotal(float total) {
    this.total = total;
  }
  
  public Data getData_elaboracao() {
    return data_elaboracao;
  }

  public void setData_elaboracao(Data data_elaboracao) {
    this.data_elaboracao = data_elaboracao;
  }

}

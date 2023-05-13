package com.techafroback.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techafroback.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
  public List<Produto> findByProduto(String produto);
}

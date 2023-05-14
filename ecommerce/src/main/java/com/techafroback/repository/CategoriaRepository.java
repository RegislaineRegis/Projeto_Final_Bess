package com.techafroback.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techafroback.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
  public List<Categoria>findAllByCategorias(String categoria);
}

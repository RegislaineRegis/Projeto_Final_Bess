package com.techafroback.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techafroback.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
  public List<Categoria>findAllByCategoria(String categoria);
}

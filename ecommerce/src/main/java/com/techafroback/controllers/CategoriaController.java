package com.techafroback.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techafroback.model.Categoria;
import com.techafroback.repositories.CategoriaRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

  @Autowired
  private CategoriaRepository categoriaRepository;
  
  @GetMapping
  public List<Categoria> findAll() {
    List<Categoria> result = categoriaRepository.findAll();
    return result;
  }

  @GetMapping(value = "/{id}")
  public Categoria findById(@PathVariable Long id) {
    Categoria result = categoriaRepository.findById(id).get();
    return result;
  }

  @PostMapping
  public Categoria insert(@RequestBody Categoria categoria) {
    Categoria result = categoriaRepository.save(categoria);
    return result;
  }

  @PutMapping
	public Categoria put (@RequestBody Categoria categoria){
		return categoriaRepository.save(categoria);
	}

  @DeleteMapping("/{id}")
	public void delete(@PathVariable Long id){
		categoriaRepository.deleteById(id);		
	}

}

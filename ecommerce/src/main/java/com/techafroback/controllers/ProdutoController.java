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

import com.techafroback.model.Produto;
// import com.techafroback.repositories.CategoriaRepository;
import com.techafroback.repositories.ProdutoRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(value= "/produto")
public class ProdutoController {
  
 // @Autowired
	// private CategoriaRepository categoriaRepository;
  
	@Autowired
	private ProdutoRepository produtoRepository;

  @GetMapping
  public List<Produto> findAll() {
    List<Produto> result = produtoRepository.findAll();
    return result;
  }

  @GetMapping(value = "/{id}")
  public Produto findById(@PathVariable Long id) {
    Produto result = produtoRepository.findById(id).get();
    return result;
  }

  @PostMapping
  public Produto insert(@RequestBody Produto produto) {
    Produto result = produtoRepository.save(produto);
    return result;
  }

  @PutMapping
	public Produto put (@RequestBody Produto produto){
		return produtoRepository.save(produto);
	}

  @DeleteMapping("/{id}")
	public void delete(@PathVariable Long id){
		produtoRepository.deleteById(id);		
	}

}

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

import com.techafroback.model.Usuario;
import com.techafroback.repository.UsuarioRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(value= "/usario")
public class UsuarioController {

  @Autowired
  private UsuarioRepository repository;
  
  @GetMapping
  public List<Usuario> findAll() {
    List<Usuario> result = repository.findAll();
    return result;
  }

  @GetMapping(value = "/{id}")
  public Usuario findById(@PathVariable Long id) {
    Usuario result = repository.findById(id).get();
    return result;
  }

  @PostMapping
  public Usuario insert(@RequestBody Usuario usuario) {
    Usuario result = repository.save(usuario);
    return result;
  }

  @PutMapping
	public Usuario put (@RequestBody Usuario usuario){
		return repository.save(usuario);
	}

  @DeleteMapping("/{id}")
	public void delete(@PathVariable Long id){
		repository.deleteById(id);		
	}

}

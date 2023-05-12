package com.techafroback.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techafroback.model.Usuario;
import com.techafroback.repositories.UsuarioRepository;

@RestController
@RequestMapping(value= "/users")
public class UsuarioController {

  @Autowired
  private UsuarioRepository repository;
  
  @GetMapping
  public List<Usuario> findAll() {
    List<Usuario> result = repository.findAll();
    return result;
  }
}

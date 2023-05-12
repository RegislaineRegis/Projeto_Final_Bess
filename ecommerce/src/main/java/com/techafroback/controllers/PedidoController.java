package com.techafroback.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techafroback.repositories.PedidoRepository;

@RestController
@RequestMapping(value="/pedido")
public class PedidoController {
    
    @Autowired
    private PedidoRepository repository;
}

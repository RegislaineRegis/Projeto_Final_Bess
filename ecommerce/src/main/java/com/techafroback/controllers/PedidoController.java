package com.techafroback.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.techafroback.model.Pedido;
import com.techafroback.repositories.PedidoRepository;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository repository;

    @GetMapping
    public List<Pedido> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Pedido> findById(@PathVariable int id) {
        return repository.findById(id);
    }

    @PostMapping
    public Pedido create(@RequestBody Pedido pedido) {
        return repository.save(pedido);
    }

    @PutMapping("/{id}")
    public Pedido update(@PathVariable int id, @RequestBody Pedido pedidoData) {
        Optional<Pedido> optionalPedido = repository.findById(id);
    
        if (optionalPedido.isPresent()) {
            Pedido pedido = optionalPedido.get();
            pedido.setEndereco(pedidoData.getEndereco());
            pedido.setQuantidade(pedidoData.getQuantidade());
            pedido.setTotal(pedidoData.getTotal());
            pedido.setData_elaboracao(pedidoData.getData_elaboracao());
    
            return repository.save(pedido);
        } else {
            throw new IllegalArgumentException("Pedido não encontrado: " + id);
        }
    }
    

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        repository.deleteById(id);
    }
}

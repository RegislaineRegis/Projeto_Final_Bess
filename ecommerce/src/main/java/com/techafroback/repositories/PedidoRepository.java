package com.techafroback.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.techafroback.model.Pedido;


public interface PedidoRepository extends JpaRepository<Pedido, Integer>{
}

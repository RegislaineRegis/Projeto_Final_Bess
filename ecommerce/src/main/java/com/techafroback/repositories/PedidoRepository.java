package com.techafroback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.techafroback.model.Pedido;


public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    
}

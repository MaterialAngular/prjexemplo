package br.com.prjimc.Repositories;

//import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import br.com.prjimc.Model.ModeloPedido;

//@Repository
public interface RepositorioPedido extends JpaRepository<ModeloPedido, Long> {
    
}

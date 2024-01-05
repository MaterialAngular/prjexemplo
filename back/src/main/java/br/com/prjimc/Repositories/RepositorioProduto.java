package br.com.prjimc.Repositories;

//import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import br.com.prjimc.Model.ModeloProduto;
//import java.util.List;
//@Repository
public interface RepositorioProduto extends JpaRepository<ModeloProduto, Long> {
   // Optional<ModeloProduto> findById(Long id);
}

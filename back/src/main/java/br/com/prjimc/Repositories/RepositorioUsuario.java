package br.com.prjimc.Repositories;

//import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import br.com.prjimc.Model.ModeloUsuario;

//@Repository
public interface RepositorioUsuario extends JpaRepository<ModeloUsuario, Long> {
    
}

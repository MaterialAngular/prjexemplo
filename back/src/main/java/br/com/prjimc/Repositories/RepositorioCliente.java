package br.com.prjimc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.prjimc.Model.ModeloCliente;

//@Repository
public interface RepositorioCliente extends JpaRepository<ModeloCliente, Long> {
    
}

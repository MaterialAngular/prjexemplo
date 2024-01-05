package br.com.prjimc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.prjimc.Model.ModeloCategoria;

//@Repository
public interface RepositorioCategoria extends JpaRepository<ModeloCategoria, Long> {
    
}

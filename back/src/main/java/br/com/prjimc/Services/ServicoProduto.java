package br.com.prjimc.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;


import br.com.prjimc.Model.ModeloProduto;
import br.com.prjimc.Repositories.RepositorioProduto;


@Service
public class ServicoProduto implements RepositorioProduto{

    @Autowired
    private RepositorioProduto repositorioProduto;

    @Override
    public ModeloProduto getById(Long id) {
        return repositorioProduto.findById(id).get();
    }
    
    @Override
    public List<ModeloProduto> findAll() {
        return repositorioProduto.findAll();
    }

    @Override
    public <S extends ModeloProduto> S save(S entity) {
        return repositorioProduto.save(entity);
    }
    
    public List<ModeloProduto> findAllByCategoria (Long id) {
        List<ModeloProduto> listaCategorias = new ArrayList<>();
        List<ModeloProduto> listaProdutos = repositorioProduto.findAll();

        for (ModeloProduto produto : listaProdutos) {
            if (produto.getIdCategoria().getId() == id) {
                listaCategorias.add(produto);
            }
        } 
        return listaCategorias;   
    } 

    public List<ModeloProduto> getIdCategoria(Long id) {
        List<ModeloProduto> listaCategorias = new ArrayList<>();
        List<ModeloProduto> listaProdutos = repositorioProduto.findAll();

        for (ModeloProduto produto : listaProdutos) {
            if (produto.getIdCategoria().getId() == id) {
                listaCategorias.add(produto);
            }
        } 
        return listaCategorias;   
    } 
    
    /********************************************************/

    @Override
    public void flush() {
        
        throw new UnsupportedOperationException("Unimplemented method 'flush'");
    }

    @Override
    public <S extends ModeloProduto> S saveAndFlush(S entity) {
        
        throw new UnsupportedOperationException("Unimplemented method 'saveAndFlush'");
    }

    @Override
    public <S extends ModeloProduto> List<S> saveAllAndFlush(Iterable<S> entities) {
       
        throw new UnsupportedOperationException("Unimplemented method 'saveAllAndFlush'");
    }

    @Override
    public void deleteAllInBatch(Iterable<ModeloProduto> entities) {
       
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllInBatch'");
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> ids) {
      
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllByIdInBatch'");
    }

    @Override
    public void deleteAllInBatch() {
       
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllInBatch'");
    }

    @Override
    public ModeloProduto getOne(Long id) {
    
        throw new UnsupportedOperationException("Unimplemented method 'getOne'");
    }

    @Override
    public ModeloProduto getReferenceById(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'getReferenceById'");
    }

    @Override
    public <S extends ModeloProduto> List<S> findAll(Example<S> example) {
      
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends ModeloProduto> List<S> findAll(Example<S> example, Sort sort) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends ModeloProduto> List<S> saveAll(Iterable<S> entities) {
        
        throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
    }

    @Override
    public List<ModeloProduto> findAllById(Iterable<Long> ids) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findAllById'");
    }

    @Override
    public Optional<ModeloProduto> findById(Long id) {
       
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public boolean existsById(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }

    @Override
    public long count() {
        
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public void deleteById(Long id) {
       
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

  

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllById'");
    }

    @Override
    public void deleteAll(Iterable<? extends ModeloProduto> entities) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public void deleteAll() {
        
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public List<ModeloProduto> findAll(Sort sort) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Page<ModeloProduto> findAll(Pageable pageable) {
    
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends ModeloProduto> Optional<S> findOne(Example<S> example) {
    
        throw new UnsupportedOperationException("Unimplemented method 'findOne'");
    }

    @Override
    public <S extends ModeloProduto> Page<S> findAll(Example<S> example, Pageable pageable) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends ModeloProduto> long count(Example<S> example) {
      
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public <S extends ModeloProduto> boolean exists(Example<S> example) {
       
        throw new UnsupportedOperationException("Unimplemented method 'exists'");
    }

    @Override
    public <S extends ModeloProduto, R> R findBy(Example<S> example,
            Function<FetchableFluentQuery<S>, R> queryFunction) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findBy'");
    }

    @Override
    public void delete(ModeloProduto entity) {
        //
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }    
}

package br.com.prjimc.Services;

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

import br.com.prjimc.Model.ModeloCategoria;
import br.com.prjimc.Repositories.RepositorioCategoria;

@Service
public class ServicoCategoria implements RepositorioCategoria{
    
    @Autowired
    private RepositorioCategoria repositorioCategoria;

    @Override
    public Optional<ModeloCategoria> findById(Long id) {
        return repositorioCategoria.findById(id);
    }

    @Override
    public ModeloCategoria getById(Long id) {
        return repositorioCategoria.findById(id).get();
    }
    
    @Override
    public List<ModeloCategoria> findAll() {
        return repositorioCategoria.findAll();
    }

     @Override
    public <S extends ModeloCategoria> S save(S entity) {
        return repositorioCategoria.save(entity);   
    }

    /************************************************** */

    @Override
    public void flush() {
        
        throw new UnsupportedOperationException("Unimplemented method 'flush'");
    }

    @Override
    public <S extends ModeloCategoria> S saveAndFlush(S entity) {
        
        throw new UnsupportedOperationException("Unimplemented method 'saveAndFlush'");
    }

    @Override
    public <S extends ModeloCategoria> List<S> saveAllAndFlush(Iterable<S> entities) {
       
        throw new UnsupportedOperationException("Unimplemented method 'saveAllAndFlush'");
    }

    @Override
    public void deleteAllInBatch(Iterable<ModeloCategoria> entities) {
       
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
    public ModeloCategoria getOne(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'getOne'");
    }

    @Override
    public ModeloCategoria getReferenceById(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'getReferenceById'");
    }

    @Override
    public <S extends ModeloCategoria> List<S> findAll(Example<S> example) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends ModeloCategoria> List<S> findAll(Example<S> example, Sort sort) {
       
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends ModeloCategoria> List<S> saveAll(Iterable<S> entities) {
        
        throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
    }
    
   @Override
    public List<ModeloCategoria> findAllById(Iterable<Long> ids) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findAllById'");
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
    public void delete(ModeloCategoria entity) {
       
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
     
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllById'");
    }

    @Override
    public void deleteAll(Iterable<? extends ModeloCategoria> entities) {
     
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public void deleteAll() {
        
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public List<ModeloCategoria> findAll(Sort sort) {
       
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Page<ModeloCategoria> findAll(Pageable pageable) {
       
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends ModeloCategoria> Optional<S> findOne(Example<S> example) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findOne'");
    }

    @Override
    public <S extends ModeloCategoria> Page<S> findAll(Example<S> example, Pageable pageable) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends ModeloCategoria> long count(Example<S> example) {
     
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public <S extends ModeloCategoria> boolean exists(Example<S> example) {
      
        throw new UnsupportedOperationException("Unimplemented method 'exists'");
    }

    @Override
    public <S extends ModeloCategoria, R> R findBy(Example<S> example,
            Function<FetchableFluentQuery<S>, R> queryFunction) {
      
        throw new UnsupportedOperationException("Unimplemented method 'findBy'");
    }    
}  

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

import br.com.prjimc.Model.ModeloUsuario;
import br.com.prjimc.Repositories.RepositorioUsuario;

@Service
public class ServicoUsuario implements RepositorioUsuario{
    
    @Override
    public List<ModeloUsuario> findAll() {
        return repositorioUsuario.findAll();
    }

     @Override
    public ModeloUsuario getById(Long id) {
        return repositorioUsuario.findById(id).get();
    }

    @Override
    public <S extends ModeloUsuario> S save(S entity) {
        return repositorioUsuario.save(entity);
    }


    @Autowired
    private RepositorioUsuario repositorioUsuario;

    @Override
    public void flush() {
        
        throw new UnsupportedOperationException("Unimplemented method 'flush'");
    }

    @Override
    public <S extends ModeloUsuario> S saveAndFlush(S entity) {
        
        throw new UnsupportedOperationException("Unimplemented method 'saveAndFlush'");
    }

    @Override
    public <S extends ModeloUsuario> List<S> saveAllAndFlush(Iterable<S> entities) {
        
        throw new UnsupportedOperationException("Unimplemented method 'saveAllAndFlush'");
    }

    @Override
    public void deleteAllInBatch(Iterable<ModeloUsuario> entities) {
        
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
    public ModeloUsuario getOne(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'getOne'");
    }

    @Override
    public ModeloUsuario getReferenceById(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'getReferenceById'");
    }

    @Override
    public <S extends ModeloUsuario> List<S> findAll(Example<S> example) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends ModeloUsuario> List<S> findAll(Example<S> example, Sort sort) {
       
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends ModeloUsuario> List<S> saveAll(Iterable<S> entities) {
        
        throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
    }

    

    @Override
    public List<ModeloUsuario> findAllById(Iterable<Long> ids) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findAllById'");
    }

   
    @Override
    public Optional<ModeloUsuario> findById(Long id) {
        
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
    public void delete(ModeloUsuario entity) {
        
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllById'");
    }

    @Override
    public void deleteAll(Iterable<? extends ModeloUsuario> entities) {
        
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public void deleteAll() {
        
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public List<ModeloUsuario> findAll(Sort sort) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Page<ModeloUsuario> findAll(Pageable pageable) {
       
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends ModeloUsuario> Optional<S> findOne(Example<S> example) {
       
        throw new UnsupportedOperationException("Unimplemented method 'findOne'");
    }

    @Override
    public <S extends ModeloUsuario> Page<S> findAll(Example<S> example, Pageable pageable) {
      
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends ModeloUsuario> long count(Example<S> example) {
       
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public <S extends ModeloUsuario> boolean exists(Example<S> example) {
        
        throw new UnsupportedOperationException("Unimplemented method 'exists'");
    }

    @Override
    public <S extends ModeloUsuario, R> R findBy(Example<S> example,
            Function<FetchableFluentQuery<S>, R> queryFunction) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findBy'");
    }    
}

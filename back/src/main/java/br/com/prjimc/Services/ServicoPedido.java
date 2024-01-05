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

import br.com.prjimc.Model.ModeloPedido;
import br.com.prjimc.Model.ModeloProduto;
import br.com.prjimc.Repositories.RepositorioPedido;
import br.com.prjimc.Repositories.RepositorioProduto;


@Service
public class ServicoPedido implements RepositorioPedido{
    
    @Autowired
    private RepositorioPedido repositorioPedido;

    @Autowired
    private RepositorioProduto repositorioProduto;

    @Override
    public List<ModeloPedido> findAll() {
        return repositorioPedido.findAll();
    }

    @Override
    public ModeloPedido getById(Long id) {
        return repositorioPedido.findById(id).get();
    } 

  /*  @Override //método implementado completo
    public ModeloPedido getById(Long id) {
        Optional<ModeloPedido> optionalPedido = repositorioPedido.findById(id);
    
        if (optionalPedido.isPresent()) {
            return optionalPedido.get();
        } else {
            // Lide com o caso em que o objeto não foi encontrado, por exemplo, lançando uma exceção personalizada
            throw new UnsupportedOperationException(" Pedido não encontrado com o ID: " + id);
        }
    }
*/
    @Override
    public <S extends ModeloPedido> S save(S entity) {
        return repositorioPedido.save(entity);
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

    @Override
    public void deleteById(Long id) {
        repositorioPedido.deleteById(id);
    }

    @Override
    public void delete(ModeloPedido entity) {
        repositorioPedido.delete(entity);
    }


    /****************************************** */
    @Override
    public void flush() {
      
        throw new UnsupportedOperationException("Unimplemented method 'flush'");
    }

    @Override
    public <S extends ModeloPedido> S saveAndFlush(S entity) {
        
        throw new UnsupportedOperationException("Unimplemented method 'saveAndFlush'");
    }

    @Override
    public <S extends ModeloPedido> List<S> saveAllAndFlush(Iterable<S> entities) {
        
        throw new UnsupportedOperationException("Unimplemented method 'saveAllAndFlush'");
    }

    @Override
    public void deleteAllInBatch(Iterable<ModeloPedido> entities) {
      
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
    public ModeloPedido getOne(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'getOne'");
    }

    @Override
    public ModeloPedido getReferenceById(Long id) {
      
        throw new UnsupportedOperationException("Unimplemented method 'getReferenceById'");
    }

    @Override
    public <S extends ModeloPedido> List<S> findAll(Example<S> example) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends ModeloPedido> List<S> findAll(Example<S> example, Sort sort) {
       
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends ModeloPedido> List<S> saveAll(Iterable<S> entities) {
        
        throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
    }

    @Override
    public List<ModeloPedido> findAllById(Iterable<Long> ids) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findAllById'");
    }

    @Override
    public Optional<ModeloPedido> findById(Long id) {
      
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
    public void deleteAllById(Iterable<? extends Long> ids) {

        throw new UnsupportedOperationException("Unimplemented method 'deleteAllById'");
    }

    @Override
    public void deleteAll(Iterable<? extends ModeloPedido> entities) {
        
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public void deleteAll() {
      
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public List<ModeloPedido> findAll(Sort sort) {
 
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Page<ModeloPedido> findAll(Pageable pageable) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends ModeloPedido> Optional<S> findOne(Example<S> example) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findOne'");
    }

    @Override
    public <S extends ModeloPedido> Page<S> findAll(Example<S> example, Pageable pageable) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends ModeloPedido> long count(Example<S> example) {
       
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public <S extends ModeloPedido> boolean exists(Example<S> example) {
        
        throw new UnsupportedOperationException("Unimplemented method 'exists'");
    }

    @Override
    public <S extends ModeloPedido, R> R findBy(Example<S> example,
            Function<FetchableFluentQuery<S>, R> queryFunction) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findBy'");
    }    
}

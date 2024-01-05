package br.com.prjimc.Rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prjimc.Model.ModeloCliente;
import br.com.prjimc.Model.ModeloPedido;
import br.com.prjimc.Model.ModeloProduto;
import br.com.prjimc.Services.ServicoCliente;
import br.com.prjimc.Services.ServicoPedido;
import br.com.prjimc.Services.ServicoProduto;

@RestController
@RequestMapping(value = "/pedidos/")
public class RestPedido {
    
    @Autowired
    private ServicoPedido servicoPedido;

    @Autowired
    private ServicoProduto servicoProduto;

    @Autowired
    private ServicoCliente servicoCliente;

 /*   @GetMapping
    private ResponseEntity<List<ModeloPedido>> getAllPedido(){
        return ResponseEntity.ok(servicoPedido.findAll());
    }  */


    @GetMapping("/clientes/{id}")
    public ResponseEntity<ModeloCliente> getById(@PathVariable("id") Long idCliente) {
        ModeloCliente entity = servicoCliente.getById(idCliente);
        return ResponseEntity.ok(entity);
    }


/*
    @GetMapping("/{id}")
    private ResponseEntity<ModeloPedido> getById(@PathVariable("id") Long id){
        ModeloPedido entity = servicoPedido.getById(id);
        return ResponseEntity.ok(entity);
    } 
  */
  
   @GetMapping ("/categorias/{id}") // Funcionando  
    private ResponseEntity<List<ModeloProduto>> getAllProdutoByCategoria(@PathVariable("id") Long idCategoria){
        return ResponseEntity.ok(servicoProduto.findAllByCategoria(idCategoria));
    } 

    
    @PostMapping
    private ResponseEntity<ModeloPedido> savePedido(@RequestBody ModeloPedido pedido){
        try {
            ModeloPedido salvarPedido = servicoPedido.save(pedido);
            return ResponseEntity.created(new URI("/pedidos/" + salvarPedido.getId())).body(salvarPedido);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        } 
    }  
}

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

import br.com.prjimc.Model.ModeloProduto;
import br.com.prjimc.Services.ServicoProduto;

@RestController   // REST - Aqui denominado de Controller
@RequestMapping(value = "/produtos/")
public class RestProduto {
    
    @Autowired
    private ServicoProduto servicoProduto;

    @GetMapping    // Funcionando
    private ResponseEntity<List<ModeloProduto>> getAllProduto(){
        return ResponseEntity.ok(servicoProduto.findAll());
    }

 //   @GetMapping  ("/pesquisar/{id}")  // Funcionando
 //   private ResponseEntity<List<ModeloProduto>> getProduto(@PathVariable(value="id") Long id){
 //       return ResponseEntity.ok(servicoProduto.findById(id));
 //   }

    @GetMapping ("/{id}")  // Funcionando
    private ResponseEntity<List<ModeloProduto>> getAllProdutoByCategoria(@PathVariable("id") Long idCategoria){
        return ResponseEntity.ok(servicoProduto.findAllByCategoria(idCategoria));
    } 

    @PostMapping
    private ResponseEntity<ModeloProduto> saveProduto(@RequestBody ModeloProduto produto){
        try {
            ModeloProduto adicionarProduto = servicoProduto.save(produto);
            return ResponseEntity.created(new URI("/produtos/" + adicionarProduto.getId())).body(adicionarProduto);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }   


/*
@PostMapping("/novoproduto")
private ResponseEntity<ModeloProduto> saveProduto(@RequestBody ModeloProduto produto){
        Long categoriaId = produto.getId();
       // ModeloCategoria categoria = servicoCategoria.findById(categoriaId);
    try {
        // Defina a categoria apropriada no produto antes de salvar
        ModeloCategoria categoria = servicoCategoria.findById(categoriaId); // Supondo que você tenha um serviço para buscar a categoria por ID
        produto.setModeloCategoria(categoria);

        ModeloProduto salvarProduto = servicoProduto.save(produto);
        return ResponseEntity.created(new URI("/produtos/" + salvarProduto.getId())).body(salvarProduto);
    } catch (Exception e) {
        // Log de exceção para rastreamento
        logger.error("Erro ao salvar o produto.", e);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao salvar o produto: " + e.getMessage());
    }
}

*/

}

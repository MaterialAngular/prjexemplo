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

import br.com.prjimc.Model.ModeloCategoria;
import br.com.prjimc.Services.ServicoCategoria;

@RestController
@RequestMapping(value = "/categorias/")
public class RestCategoria {
    
    @Autowired
    private ServicoCategoria servicoCategoria;

    @GetMapping
    private ResponseEntity<List<ModeloCategoria>> getAllCategorias(){
        return ResponseEntity.ok(servicoCategoria.findAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<ModeloCategoria> getById(@PathVariable("id") Long id){
        ModeloCategoria entity = servicoCategoria.getById(id);
        return ResponseEntity.ok(entity);

    }
    @PostMapping
    private ResponseEntity<ModeloCategoria> saveCategoria(@RequestBody ModeloCategoria categoria){
        try {
            ModeloCategoria salvarCategoria = servicoCategoria.save(categoria);
            return ResponseEntity.created(new URI("/categorias/" + salvarCategoria.getId())).body(salvarCategoria);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        
    }
}

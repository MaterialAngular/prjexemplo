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
import br.com.prjimc.Services.ServicoCliente;

@RestController
@RequestMapping(value = "/clientes/")
public class RestCliente {
    
    @Autowired
    private ServicoCliente servicoCliente;
    

    @GetMapping
    private ResponseEntity<List<ModeloCliente>> getAllClientes(){
        return ResponseEntity.ok(servicoCliente.findAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<ModeloCliente> getById(@PathVariable("id") Long id){
        ModeloCliente entity = servicoCliente.getById(id);
        return ResponseEntity.ok(entity);
    }
    
    @PostMapping
    private ResponseEntity<ModeloCliente> saveCliente(@RequestBody ModeloCliente cliente){
        try {
            ModeloCliente salvarCliente = servicoCliente.save(cliente);
            return ResponseEntity.created(new URI("/clientes/" + salvarCliente.getId())).body(salvarCliente);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        
    }
}

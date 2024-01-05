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

import br.com.prjimc.Model.ModeloUsuario;
import br.com.prjimc.Services.ServicoUsuario;

@RestController
@RequestMapping(value = "/usuarios/")
public class RestUsuario {

    @Autowired
    private ServicoUsuario servicoUsuario;

    @GetMapping
    private ResponseEntity<List<ModeloUsuario>> getAllUsuarios(){
        return ResponseEntity.ok(servicoUsuario.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<ModeloUsuario> getById(@PathVariable("id") Long id){
        ModeloUsuario entity = servicoUsuario.getById(id);
        return ResponseEntity.ok(entity);
    }
    
    @PostMapping("/{novousuario}")
    private ResponseEntity<ModeloUsuario> saveUsuario(@RequestBody ModeloUsuario usuario){
        try {
            ModeloUsuario salvarUsuario = servicoUsuario.save(usuario);
            return ResponseEntity.created(new URI("/usuarios/novousuario" + salvarUsuario.getId())).body(salvarUsuario);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        
    }
}

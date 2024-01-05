package br.com.prjimc.Model;

import java.io.Serializable;
//import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import org.springframework.hateoas.RepresentationModel;

@Entity
@Table(name="tblcategorias")
public class ModeloCategoria extends RepresentationModel<ModeloCategoria> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    private String descricao;

    public ModeloCategoria (){

    }

    public ModeloCategoria(String descricao) {
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   
}

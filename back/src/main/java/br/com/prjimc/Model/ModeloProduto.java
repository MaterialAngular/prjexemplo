package br.com.prjimc.Model;

import java.io.Serializable;

import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name="tblprodutos", uniqueConstraints = {@UniqueConstraint(columnNames = {"descricao"})})
@Table(name="tblprodutos")
public class ModeloProduto extends RepresentationModel<ModeloProduto> implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String descricao;
       
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private ModeloCategoria idCategoria;

    public ModeloProduto(){

    }

    public ModeloProduto(String descricao, ModeloCategoria categoria) {
        this.descricao = descricao;
        this.idCategoria = categoria;
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

    public ModeloCategoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(ModeloCategoria idCategoria) {
        this.idCategoria = idCategoria;
    } 
}

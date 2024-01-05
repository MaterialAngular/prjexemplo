package br.com.prjimc.Model;

import java.io.Serializable;
//import java.util.UUID;

import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tblusuarios")
public class ModeloUsuario extends RepresentationModel<ModeloUsuario> implements Serializable {
    
    //private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nomeusuario;
    private String loginusuario;
    private String senhausuario;

    public ModeloUsuario(){
        
    }

    public ModeloUsuario(String nomeusuario, String loginusuario, String senhausuario) {
        this.nomeusuario = nomeusuario;
        this.loginusuario = loginusuario;
        this.senhausuario = senhausuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeusuario() {
        return nomeusuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    public String getLoginusuario() {
        return loginusuario;
    }

    public void setLoginusuario(String loginusuario) {
        this.loginusuario = loginusuario;
    }

    public String getSenhausuario() {
        return senhausuario;
    }

    public void setSenhausuario(String senhausuario) {
        this.senhausuario = senhausuario;
    }

}

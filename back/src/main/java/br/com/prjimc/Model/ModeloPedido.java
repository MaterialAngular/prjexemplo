package br.com.prjimc.Model;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tblpedidos")
public class ModeloPedido extends RepresentationModel<ModeloPedido> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @ManyToOne
    @JoinColumn(name="id_cliente")
    private ModeloCliente idCliente; 

    @ManyToOne
    @JoinColumn(name="id_categoria")
    private ModeloCategoria idCategoria;

    @ManyToOne
    @JoinColumn(name="id_produto")
    private ModeloProduto idProduto; 

    @Column(name = "datapedido")
    private LocalDate dataPedido; 

    private int quantidade;
    //private date datapedido;
    
    public ModeloPedido(){

    } 

    public ModeloPedido(ModeloCliente idCliente, ModeloCategoria idCategoria, ModeloProduto idProduto, int quantidade, LocalDate dataPedido) {
       // public ModeloPedido(ModeloCliente idCliente, ModeloCategoria idCategoria, ModeloProduto idProduto, int quantidade) {
        this.idCliente     = idCliente;
        this.idCategoria   = idCategoria;
        this.idProduto     = idProduto;
        this.dataPedido    = dataPedido;
        this.quantidade    = quantidade;
    }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public ModeloCliente getIdCliente() {
            return idCliente;
        }

        public void setIdCliente(ModeloCliente idCliente) {
            this.idCliente = idCliente;
        }

        public ModeloCategoria getIdCategoria() {
            return idCategoria;
        }

        public void setIdCategoria(ModeloCategoria idCategoria) {
            this.idCategoria = idCategoria;
        }

        public ModeloProduto getIdProduto() {
            return idProduto;
        }

        public void setIdProduto(ModeloProduto idProduto) {
            this.idProduto = idProduto;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public LocalDate getDataPedido() {
            return dataPedido;
        }

        public void setDataPedido(LocalDate dataPedido) {
            this.dataPedido = dataPedido;
        }

}

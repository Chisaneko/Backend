package edu.unifaa.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long produtoId;

    @Column(nullable = false)
    private String produtoNome;
    
    @Column(nullable = false)
    private Long produtoQuantidade;

    @Column(nullable = false)
    private double produtoValor;

    @ManyToOne
    @JoinColumn(name = "categoriaProdutoId")
    @JsonBackReference
    private Categoria produtoCategoriaId;

    //Getter e Setters
    //=======================================================================================================================================

    public Long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Long produtoId) {
        this.produtoId = produtoId;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public Long getProdutoQuantidade() {
        return produtoQuantidade;
    }

    public void setProdutoQuantidade(Long produtoQuantidade) {
        this.produtoQuantidade = produtoQuantidade;
    }

    public double getProdutoValor() {
        return produtoValor;
    }

    public void setProdutoValor(double produtoValor) {
        this.produtoValor = produtoValor;
    }

    public Categoria getProdutoCategoriaId() {
        return produtoCategoriaId;
    }

    public void setProdutoCategoriaId(Categoria produtoCategoriaId) {
        this.produtoCategoriaId = produtoCategoriaId;
    }

 
}

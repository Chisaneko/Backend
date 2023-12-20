package edu.unifaa.ecommerce.model;

import edu.unifaa.ecommerce.model.myenum.EDepartamento;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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

    @Column(nullable = false)
    private EDepartamento produtoDepartamento;

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

    public EDepartamento getProdutoDepartamento() {
        return produtoDepartamento;
    }

    public void setProdutoDepartamento(EDepartamento produtoDepartamento) {
        this.produtoDepartamento = produtoDepartamento;
    }


}

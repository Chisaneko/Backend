package edu.unifaa.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EndereçoDeEntrega {

    @Id
    @Column(nullable = false)
    private Long entregaIdCliente;

    @Column(nullable = false)
    private String entregaCep;

    @Column(nullable = false)
    private String entregaPais;

    @Column(nullable = false)
    private String entregaEstado;

    @Column(nullable = false)
    private String entregaCidade;

    @Column(nullable = false)
    private String entregaRua;

    @Column(nullable = false)
    private String entregaNum;

    //Getter e Setters
    //=======================================================================================================================================

    public Long getEntregaIdCliente() {
        return entregaIdCliente;
    }

    public void setEntregaIdCliente(Long entregaIdCliente) {
        this.entregaIdCliente = entregaIdCliente;
    }

    public String getEntregaCep() {
        return entregaCep;
    }

    public void setEntregaCep(String entregaCep) {
        this.entregaCep = entregaCep;
    }

    public String getEntregaPais() {
        return entregaPais;
    }

    public void setEntregaPais(String entregaPais) {
        this.entregaPais = entregaPais;
    }

    public String getEntregaEstado() {
        return entregaEstado;
    }

    public void setEntregaEstado(String entregaEstado) {
        this.entregaEstado = entregaEstado;
    }

    public String getEntregaCidade() {
        return entregaCidade;
    }

    public void setEntregaCidade(String entregaCidade) {
        this.entregaCidade = entregaCidade;
    }

    public String getEntregaRua() {
        return entregaRua;
    }

    public void setEntregaRua(String entregaRua) {
        this.entregaRua = entregaRua;
    }

    public String getEntregaNum() {
        return entregaNum;
    }

    public void setEntregaNum(String entregaNum) {
        this.entregaNum = entregaNum;
    }

}

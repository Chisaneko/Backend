package edu.unifaa.ecommerce.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clienteId;

    @Column(nullable = false)
    private String clientePrimeiroNome;

    @Column(nullable = false)
    private String clienteSegundoNome;

    @Column(nullable = false)
    private String clienteCpf;

    @Column(nullable = false)
    private String clienteEmail;

    @Column(nullable = false)
    private String clienteSenha;

    @OneToMany(mappedBy = "enderecoCliente")
    @JsonManagedReference
    private List<Endereco> clienteEndereco;
    //Getter e Setters
    //=======================================================================================================================================

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getClientePrimeiroNome() {
        return clientePrimeiroNome;
    }

    public void setClientePrimeiroNome(String clientePrimeiroNome) {
        this.clientePrimeiroNome = clientePrimeiroNome;
    }

    public String getClienteSegundoNome() {
        return clienteSegundoNome;
    }

    public void setClienteSegundoNome(String clienteSegundoNome) {
        this.clienteSegundoNome = clienteSegundoNome;
    }

    public String getClienteCpf() {
        return clienteCpf;
    }

    public void setClienteCpf(String clienteCpf) {
        this.clienteCpf = clienteCpf;
    }

    public String getClienteEmail() {
        return clienteEmail;
    }

    public void setClienteEmail(String clienteEmail) {
        this.clienteEmail = clienteEmail;
    }

    public String getClienteSenha() {
        return clienteSenha;
    }

    public void setClienteSenha(String clienteSenha) {
        this.clienteSenha = clienteSenha;
    }

    public List<Endereco> getClienteEndereco() {
        return clienteEndereco;
    }

    public void setClienteEndereco(List<Endereco> clienteEndereco) {
        this.clienteEndereco = clienteEndereco;
    }


}
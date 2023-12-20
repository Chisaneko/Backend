package edu.unifaa.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unifaa.ecommerce.model.Cliente;
import edu.unifaa.ecommerce.service.ClienteService;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/cliente")
@CrossOrigin("*")

public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> obterTodosClientes(){
        return  clienteService.obterTodosClientes();
    }

    @PostMapping
    public Cliente adcionarCliente(@RequestBody Cliente cliente){
        return clienteService.adicionarCliente(cliente);
    }

    @PutMapping("/{id}")
    public Cliente atualizarCliente(@PathVariable Long id,@RequestBody Cliente cliente){
        return clienteService.atualizarCliente(id, cliente);
        
    }
    
    @DeleteMapping("/{id}")
    public void deletarCliente(@PathVariable Long id){
        clienteService.deletarCliente(id);
    }
}

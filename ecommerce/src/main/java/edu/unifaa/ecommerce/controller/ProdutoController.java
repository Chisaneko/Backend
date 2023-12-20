package edu.unifaa.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unifaa.ecommerce.model.Cliente;
import edu.unifaa.ecommerce.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
@CrossOrigin("*")

public class ProdutoController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> obterTodos(){
        return  clienteService.obterTodos();
    }
    
}

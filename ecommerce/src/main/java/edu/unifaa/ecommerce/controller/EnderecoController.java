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

import edu.unifaa.ecommerce.model.Endereco;
import edu.unifaa.ecommerce.service.EnderecoService;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/endereco")
@CrossOrigin("*")

public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public List<Endereco> obterTodosEnderecos(){
        return  enderecoService.obterTodosEnderecos();
    }

    @PostMapping
    public Endereco adcionarEndereco(@RequestBody Endereco endereco){
        return enderecoService.adicionarEndereco(endereco);
    }

    @PutMapping("/{id}")
    public Endereco atualizarEndereco(@PathVariable Long id,@RequestBody Endereco endereco){
        return enderecoService.atualizarEndereco(id, endereco);
        
    }
    
    @DeleteMapping("/{id}")
    public void deletarEndereco(@PathVariable Long id){
        enderecoService.deletarEndereco(id);
    }
}

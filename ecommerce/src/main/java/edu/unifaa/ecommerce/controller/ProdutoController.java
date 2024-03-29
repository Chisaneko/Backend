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

import edu.unifaa.ecommerce.model.Produto;
import edu.unifaa.ecommerce.service.ProdutoService;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/produto")
@CrossOrigin("*")

public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> obterTodosProdutos(){
        return  produtoService.obterTodosProdutos();
    }

    @GetMapping("/{id}")
    public Produto obterPorId(@PathVariable Long id){
        return produtoService.obterProdutoPorId(id);
    }

    @PostMapping
    public Produto adcionarProduto(@RequestBody Produto produto){
        return produtoService.adicionarProduto(produto);
    }

    @PutMapping("/{id}")
    public Produto atualizarProduto(@PathVariable Long id,@RequestBody Produto produto){
        return produtoService.atualizarProduto(id, produto);
        
    }
    
    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id){
        produtoService.deletarProduto(id);
    }
}

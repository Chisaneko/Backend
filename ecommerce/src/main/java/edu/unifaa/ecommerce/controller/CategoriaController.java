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

import edu.unifaa.ecommerce.model.Categoria;
import edu.unifaa.ecommerce.service.CategoriaService;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/categoria")
@CrossOrigin("*")

public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> obterTodosCategorias(){
        return  categoriaService.obterTodosCategorias();
    }

    @GetMapping("/{id}")
    public Categoria obterPorId(@PathVariable Long id){
        return categoriaService.obterCategoriaPorId(id);
    }

    @PostMapping
    public Categoria adcionarCategoria(@RequestBody Categoria categoria){
        return categoriaService.adicionarCategoria(categoria);
    }

    @PutMapping("/{id}")
    public Categoria atualizarCategoria(@PathVariable Long id,@RequestBody Categoria categoria){
        return categoriaService.atualizarCategoria(id, categoria);
        
    }
    
    @DeleteMapping("/{id}")
    public void deletarCategoria(@PathVariable Long id){
        categoriaService.deletarCategoria(id);
    }
}

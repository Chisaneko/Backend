package edu.unifaa.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unifaa.ecommerce.model.Categoria;
import edu.unifaa.ecommerce.model.exceptions.ResourceNotFoundException;
import edu.unifaa.ecommerce.repository.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> obterTodosCategorias(){
        return categoriaRepository.findAll();
    }

        public Categoria obterCategoriaPorId(Long id){
       Optional<Categoria> optCategoria = categoriaRepository.findById(id);

       if(optCategoria.isEmpty()){
        throw new ResourceNotFoundException("Não existe uma categoria de produto com o ID " + id);
        }

       return optCategoria.get();
    }

    public Categoria adicionarCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    public Categoria atualizarCategoria(Long idCategoria,Categoria categoria){
        categoria.setCategoriaId(idCategoria);
        return categoriaRepository.save(categoria);
    }
    
    public void deletarCategoria(Long idCategoria){
        categoriaRepository.deleteById(idCategoria);
    }
}

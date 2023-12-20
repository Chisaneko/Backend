package edu.unifaa.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unifaa.ecommerce.model.Produto;
import edu.unifaa.ecommerce.model.exceptions.ResourceNotFoundException;
import edu.unifaa.ecommerce.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> obterTodosProdutos(){
        return produtoRepository.findAll();
    }

    public Produto obterProdutoPorId(Long id){
       Optional<Produto> optProduto = produtoRepository.findById(id);

       if(optProduto.isEmpty()){
        throw new ResourceNotFoundException("Não existe um produto com o ID " + id);
        }

       return optProduto.get();
    }

    public Produto adicionarProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public Produto atualizarProduto(Long idProduto,Produto produto){
        produto.setProdutoId(idProduto);
        return produtoRepository.save(produto);
    }
    
    public void deletarProduto(Long idProduto){
        produtoRepository.deleteById(idProduto);
    }
}

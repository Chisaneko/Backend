package edu.unifaa.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unifaa.ecommerce.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
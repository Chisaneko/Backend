package edu.unifaa.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unifaa.ecommerce.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    
}
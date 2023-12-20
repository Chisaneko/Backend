package edu.unifaa.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unifaa.ecommerce.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
    
}
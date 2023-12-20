package edu.unifaa.ecommerce.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Categoria {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoriaId;

    @Column(nullable = false)
    private String categoriaNome;
  
    @OneToMany(mappedBy = "produtoCategoriaId")
    @JsonManagedReference
    private List<Produto> categoriaProdutoId;
    

    //Getter e Setters
    //=======================================================================================================================================
    


    public Long getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Long categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getCategoriaNome() {
        return categoriaNome;
    }

    public void setCategoriaNome(String categoriaNome) {
        this.categoriaNome = categoriaNome;
    }

    public List<Produto> getCategoriaProdutoId() {
        return categoriaProdutoId;
    }

    public void setCategoriaProdutoId(List<Produto> categoriaProdutoId) {
        this.categoriaProdutoId = categoriaProdutoId;
    }

    
}


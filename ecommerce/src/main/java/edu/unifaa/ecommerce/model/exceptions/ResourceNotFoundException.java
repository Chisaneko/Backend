package edu.unifaa.ecommerce.model.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String mensagem){
        super(mensagem);
    }
    
}

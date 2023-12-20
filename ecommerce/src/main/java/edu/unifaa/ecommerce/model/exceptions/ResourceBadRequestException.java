package edu.unifaa.ecommerce.model.exceptions;

public class ResourceBadRequestException extends RuntimeException{
    public ResourceBadRequestException (String mensagem){
        super(mensagem);
    }
}

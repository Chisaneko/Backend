package edu.unifaa.ecommerce.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import edu.unifaa.ecommerce.model.exceptions.ResourceBadRequestException;
import edu.unifaa.ecommerce.model.exceptions.ResourceNotFoundException;
import edu.unifaa.ecommerce.model.myenum.ModeloErro;

@ControllerAdvice
public class RestExceptionHandler {
    
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handlerResourceNotFoundException(ResourceNotFoundException exception){

        ModeloErro erro = new ModeloErro("Not Found", exception.getMessage(), 404);

        return ResponseEntity.status(404).body(erro);
    }

    @ExceptionHandler(ResourceBadRequestException.class)
    public ResponseEntity<?> handlerResourceBadRequestException(ResourceBadRequestException exception){

        ModeloErro erro = new ModeloErro("Bad Request", exception.getMessage(), 400);
        return ResponseEntity.status(400).body(erro);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> hanlderResourceException(Exception exception){

        ModeloErro erro = new ModeloErro("Internal Server Error", exception.getMessage(), 500);

        return ResponseEntity.status(500).body(erro);
    }
}

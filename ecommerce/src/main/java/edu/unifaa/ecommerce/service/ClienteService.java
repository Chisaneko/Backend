package edu.unifaa.ecommerce.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unifaa.ecommerce.model.Cliente;
import edu.unifaa.ecommerce.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> obterTodos(){
        return clienteRepository.findAll();
    }

    
}

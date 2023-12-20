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

    public List<Cliente> obterTodosClientes(){
        return clienteRepository.findAll();
    }

    public Cliente adicionarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente atualizarCliente(Long idCliente,Cliente cliente){
        cliente.setClienteId(idCliente);
        return clienteRepository.save(cliente);
    }
    
    public void deletarCliente(Long idCliente){
        clienteRepository.deleteById(idCliente);
    }
}

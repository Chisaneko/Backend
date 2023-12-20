package edu.unifaa.ecommerce.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unifaa.ecommerce.model.Endereco;
import edu.unifaa.ecommerce.repository.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> obterTodosEnderecos(){
        return enderecoRepository.findAll();
    }

    public Endereco adicionarEndereco(Endereco endereco){
        return enderecoRepository.save(endereco);
    }

    public Endereco atualizarEndereco(Long idEndereco,Endereco endereco){
        endereco.setEnderecoId(idEndereco);
        return enderecoRepository.save(endereco);
    }
    
    public void deletarEndereco(Long idEndereco){
        enderecoRepository.deleteById(idEndereco);
    }
}

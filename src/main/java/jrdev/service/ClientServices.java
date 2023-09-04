package jrdev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jrdev.model.Client;
import jrdev.repository.ClientRepository;

@Service
public class ClientServices {
    //injeção de dependências
    @Autowired
    private ClientRepository clientRepository;
    //construtor
    public ClientServices(ClientRepository clientRepository){
        this.clientRepository=clientRepository;
    }
    public void saveClient(Client client){
        validateClient(client);
        //ClientRepository clientRepository=new ClientRepository(); //Não convem pois há coneção com banco de dados
        this.clientRepository.saveClient(client);
    }
    public void validateClient(Client client){
        //regras de validação
    }
}

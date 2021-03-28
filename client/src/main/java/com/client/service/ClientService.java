package com.client.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.entity.Client;
import com.client.exception.ClientNotFoundException;
import com.client.repository.ClientRepository;

@Service
public class ClientService {
	
	 @Autowired
	 private ClientRepository clientRepository; 
	 
	 public Client getClient( int id) {
   	  
		 Client client= clientRepository.findById((long) id ).get();
		if(client==null) 
			throw new ClientNotFoundException("Client not found for given id "+id);
   	  return client;
   	  
     }

      
      
      
      
      	public Client addClient( Client client) {
      		
      		return  clientRepository.save(client);
      	}
      	
      	
      	public String updateClient( Client client) {
      		
      		
      		Client clientInfo=clientRepository.save(client);
      		if(clientInfo!=null) {
      			return "Employee details updated suceesfully"; 
      		}
      		
      		
      		
      		return "Employee not found";
      		
      	}
      	
      	
      	
      	
      	public String deleteClient( int ClientId) {
      		clientRepository.deleteById((long) ClientId);
      		
      		return "Client record deleted suceesfully";
      	}


}




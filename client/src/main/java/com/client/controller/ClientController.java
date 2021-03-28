package com.client.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.client.entity.Client;
import com.client.service.ClientService;

@RestController
public class ClientController {
	@Autowired
	private ClientService clientService;
	
	 
	  @GetMapping("/employees/{id}")
      public Client getClient(@PathVariable int id) {
    	  
    	  return clientService.getClient(id) ;
    	  
      }

	  
       
       @PostMapping("/addClient")
       	public Client addClient(@RequestBody Client client) {
       		
       		return clientService.addClient(client);
       	}
       	
       	@PutMapping("/updateClient")
       	public String update(@RequestBody Client client) {
       		return clientService.updateClient(client);
       	}
       	
       	@DeleteMapping("/employee/{id}")
       	public String deleteEmployee(@PathVariable(value="id") int clientId) {
       		return clientService.deleteClient(clientId);
       	}


}

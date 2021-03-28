package com.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	
	

}

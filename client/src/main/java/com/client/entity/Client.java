package com.client.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Client")
public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 846385391360634476L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	@Column (name="FIRST_NAME")
	private String firstName;
	@Column (name="LAST_NAME")
	private String lastName;
	@Column (name="IDENTIFICATION")
    private String identification;
	@Column (name="PHONE_NUMBER")
	private Long phonenumber;
	@Column (name="EMAIL_ID")
	private String email;
	
	public Client() {
		
	}

	public Client(Long id, String firstName, String lastName, String identification, Long phonenumber, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identification = identification;
		this.phonenumber = phonenumber;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public Long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
	

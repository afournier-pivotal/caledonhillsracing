package com.afournier.chr.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Team implements Serializable {

	/**
	 * author Adam Fournier
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String firstname;
	private String lastname;
	private String email;
	private String bio;
	private String picture;
	
	public Team() {}

	public Team(String firstname, String lastname, String email, String bio, String picture) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.bio = bio;
		this.picture = picture;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
}

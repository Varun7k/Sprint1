package com.example.demo.entity;

import javax.persistence.*;



@Entity
@Table(name = "customres")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false,  length = 20)
	private String firstName;
	@Column(nullable = false,  length = 20)
	private String lastName;
	@Column(nullable = false, unique = true, length = 45)
	private String email;
	@Column(nullable = false,  length = 42)
	private String password;
	@Column(nullable = false)
	private String contactNumber;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	

}

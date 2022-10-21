package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity// map class with table 
@Table(name="QAEmployee")// change the name in the table 
public class Employee {// name of class = name of table 
	private int id;
    private String name;
    private String email;
    private long phone;
    @Id// create a primary key 
    @GeneratedValue(strategy=GenerationType.IDENTITY)// use internal algorithm to generate primary key value 
    @Column(name="Eid")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="FullName", nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="EmailAddress", unique=true)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name="PhoneNumber")
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Employee(int id, String name, String email, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	public Employee() {
		super();
	}
    
	

}

package com.example.account;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Account {
	private long id;
    private String accountNumber;
    private String name;
	@Column(name="FullName", nullable=false, unique=true)
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setName(String accountNumber) {
		this.accountNumber = accountNumber;
	}
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setField(String name) {
		this.name = name;
	
	}
	public Account(String accountNumber, long id, String name) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.name = name;
	}
	public Account() {
		super();
	}

    
	

}



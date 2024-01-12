package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Employee")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idClient;
	@Column(name = "fullName",nullable=false)
	private String fullName;
	@Column(name = "idOrder",nullable=false)
	private String idOrder;
	
	public Client(){}
	
	public Client(long idClient, String fullName, String idOrder, long id_boss) {
		super();
		this.idClient = idClient;
		this.fullName = fullName;
		this.idOrder = idOrder;
	}

	public long getIdClient() {
		return idClient;
	}

	public void setIdClient(long idEmp) {
		this.idClient = idEmp;
	}

	public String getFullname() {
		return fullName;
	}

	public void setFullname(String fullName) {
		this.fullName = fullName;
	}

	public String getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(String idOrder) {
		this.idOrder = idOrder;
	}

}

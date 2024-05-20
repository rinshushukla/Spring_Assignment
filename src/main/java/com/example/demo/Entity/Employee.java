package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	
	private  String efirstname;
	private  String elastname;
	private  String position;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEfirstname() {
		return efirstname;
	}
	public void setEfirstname(String efirstname) {
		this.efirstname = efirstname;
	}
	public String getElastname() {
		return elastname;
	}
	public void setElastname(String elastname) {
		this.elastname = elastname;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", efirstname=" + efirstname + ", elastname=" + elastname + ", position="
				+ position + "]";
	}
	public Employee(int eid, String efirstname, String elastname, String position) {
		super();
		this.eid = eid;
		this.efirstname = efirstname;
		this.elastname = elastname;
		this.position = position;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
	

}

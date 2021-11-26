package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
@SequenceGenerator(initialValue = 4000, name ="dbaseq", sequenceName = "dbaseq")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dbaseq")
	private long dId;
	private String dName;
	private String dAddress;
	private String dCode;
	public long getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getdAddress() {
		return dAddress;
	}
	public void setdAddress(String dAddress) {
		this.dAddress = dAddress;
	}
	public String getdCode() {
		return dCode;
	}
	public void setdCode(String dCode) {
		this.dCode = dCode;
	}
	public Department(long dId, String dName, String dAddress, String dCode) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dAddress = dAddress;
		this.dCode = dCode;
	}
	public Department() {
		
	}
	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + ", dAddress=" + dAddress + ", dCode=" + dCode + "]";
	}
	
	
	
	
	
	
}

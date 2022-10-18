package com.hello.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class HelloEntity {
	 
	@Id
	int id;
	String text;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public HelloEntity(int id, String text) {
		super();
		this.id = id;
		this.text = text;
	}
	public HelloEntity() {
		super();
	}
	@Override
	public String toString() {
		return "HelloEntity [id=" + id + ", text=" + text + "]";
	}
	
	
	
}

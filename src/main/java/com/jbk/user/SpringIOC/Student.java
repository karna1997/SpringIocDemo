package com.jbk.user.SpringIOC;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("${id}")
	int id;
	@Value("${name}")
	String name;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public void study() {
		System.out.println("study()---student");
		
		
	}

	public void meeting() {
		System.out.println("meeting()----student");
		
		
	}

}

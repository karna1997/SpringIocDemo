package com.jbk.user.SpringIOC;

import org.springframework.beans.factory.annotation.Value;

public class Teacher  {
	@Value("${t_id}")
	int t_id;
	@Value("${t_name}")
	String t_name;
	void teaching() {
		System.out.println("Teaching---- Teacher");
	}

	public void study() {
		System.out.println("study()--- Teacher class");
	}

	public void meeting() {
		System.out.println("meeting()-----Teacher class");
	}

	@Override
	public String toString() {
		return "Teacher [t_id=" + t_id + ", t_name=" + t_name + "]";
	}

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
}

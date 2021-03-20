package com.jbk.user.SpringIOC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration 
@PropertySource("classpath:application.properties")
public class ConfigurationClass {
	 
	@Bean
	public Student getStudentBean(){
		return new Student();
	}
	@Bean
	public Teacher getTeacherBean(){
		return new Teacher();
	}

}

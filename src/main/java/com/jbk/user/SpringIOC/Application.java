package com.jbk.user.SpringIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		ApplicationContext context= new AnnotationConfigApplicationContext(ConfigurationClass.class);
	Student student=context.getBean(Student.class);
	 student.study();
	 student.meeting();
	 System.out.println(student.id);
	 System.out.println(student.name);
	 System.out.println(student);
	 
	 System.out.println("###################################################");
     Teacher teacher = context.getBean(Teacher.class);
     teacher.study();
     teacher.meeting();
     teacher.teaching();
     System.out.println(teacher.t_id);
     System.out.println(teacher.t_name);
     System.out.println(teacher);
	}

}

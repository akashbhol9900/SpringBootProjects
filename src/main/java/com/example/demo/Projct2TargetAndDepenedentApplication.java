package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nt.beans.StudentTarget;

@SpringBootApplication
@ComponentScan(basePackages = "com.nt.beans")
public class Projct2TargetAndDepenedentApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Projct2TargetAndDepenedentApplication.class, args);
		System.out.println("i love code very much");
		StudentTarget stu1=context.getBean("stu",StudentTarget.class);
		System.out.println("i will marray to code");
		String result=stu1.getCoursedetails();
		System.out.println(result);
	}

}

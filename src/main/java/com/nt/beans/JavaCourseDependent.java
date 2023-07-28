package com.nt.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("java")
@Primary

public class JavaCourseDependent implements ICourseMeterial {

	
	public JavaCourseDependent()
	{
		System.out.println("this is 0 param constructer");
	}
	@Override
	public String courseName() {
		// TODO Auto-generated method stub
		return "opps,Exception,thred,collection";
	}

	@Override
	public String coursePrice() {
		// TODO Auto-generated method stub
		return "7000";
	}

}

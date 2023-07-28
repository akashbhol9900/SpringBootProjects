package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("dot")
public class DotnetCourseDepenedent implements ICourseMeterial {

	public DotnetCourseDepenedent()
	{
		System.out.println("this is 0 param constructer");
	}
	@Override
	public String courseName() {
		// TODO Auto-generated method stub
		return "String,array,opps";
	}

	@Override
	public String coursePrice() {
		// TODO Auto-generated method stub
		return "10000";
	}

}

package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("stu")
@Qualifier("java")
public class StudentTarget {
   @Autowired
   private ICourseMeterial meterial;
	public StudentTarget()
	{
		System.out.println("this is 0 param constructer for  ICourseMeterial");
	}
	public String getCoursedetails()
	{
		String course=meterial.courseName();
		String price=meterial.coursePrice();
		return course+" "+price;
	}
}

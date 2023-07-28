package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("ui")
public class Uidependent implements ICourseMeterial {

	public Uidependent()
	{
		System.out.println("this is 0 param consructer");
	}
	@Override
	public String courseName() {
		// TODO Auto-generated method stub
		return "js,html,css,bootstrap";
	}

	@Override
	public String coursePrice() {
		// TODO Auto-generated method stub
		return "5000";
	}

}

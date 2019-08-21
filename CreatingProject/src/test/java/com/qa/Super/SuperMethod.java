package com.qa.Super;

public class SuperMethod {
	
	String car="RANG ROVER";
	
	/*void speed()
	{
		System.out.println("100 km per hour");
	}*/
	SuperMethod()
	{
	System.out.println("This is SuperMethod class");	
	}
	
}
class Bus extends SuperMethod{
	String car="AUDI";
	
	Bus()
	{
		super();
		System.out.println("This is Bus class");
	}
	
	
	
	/*void displaycar()
	{
		System.out.println(super.car);
		//System.out.println(car);
	
	void speed()
	{
		System.out.println("50 km per hour");
		super.speed();
	}*/
}

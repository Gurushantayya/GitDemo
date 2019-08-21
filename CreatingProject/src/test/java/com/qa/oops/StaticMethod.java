package com.qa.oops;

public class StaticMethod {
	
	static int a=200;
	int b=500;
	  
	static void Bank()
	{
		
		System.out.println("This Bank is a static Method"+a);
	}
	
	void Axis()
	{
	Bank();

		System.out.println(a);
		//System.out.println(b);
		System.out.println("This Axis is non -static method");
	}
	
	
public static void main(String[] args) {
		
	//Bank();
//System.out.println(a);
StaticMethod sm= new StaticMethod();
sm.Axis();
	System.out.println(sm.b);
	
	
	
	}

}

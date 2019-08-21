package com.qa.Interfaces;

interface A
{
	int a=100;
	int b=200;
	
	void m1();
}


class B implements A
{
	public void m1()
	{
		System.out.println(a+b);
	}
}
public class Assignment {

	public static void main(String[] args) {

           A a=new B();
           a.m1();
	}

}

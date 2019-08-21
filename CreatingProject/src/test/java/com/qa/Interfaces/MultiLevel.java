package com.qa.Interfaces;

interface C
{
	int a=200;
	int b=300;
	
	void add();
}
 
interface D extends C
{
	int x=4;
	int y=5;
	
	void mul();
}
class F
{
	int m;
	void m1()
	{
		m=111;
		System.out.println(m);
	}
}
class E extends F implements D
{
	public void add()
	{
		System.out.println(a+b);
	}
	public void mul()
	{
		System.out.println(x*y);
	}
}

public class MultiLevel extends E{

	public static void main(String[] args) {

		MultiLevel ML=new MultiLevel();
		ML.add();
		ML.mul();
		ML.m1();

	}

}

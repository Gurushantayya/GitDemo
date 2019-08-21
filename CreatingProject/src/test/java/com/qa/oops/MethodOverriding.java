package com.qa.oops;


 class A
{
	int a,b;
	void sum(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
	void add()
	{
		System.out.println(a+b);
	}
}

/*
class B extends A
{
	void sum(int x, int y)
	{
		a=x;
		b=y;
		System.out.println(x*y);
	}
}
 
class C extends A
{
	void sum(int x, int y)
	{
		a=x;
		b=y;
		System.out.println(x-y);
	}
}
*/
public class MethodOverriding {

	public static void main(String[] args) {
		
		A a = new A();
				a.sum(10, 20);
				a.add();
				/*B b=new B();
				b.sum(20, 40);
				C c= new C();
				c.sum(400, 250);*/
		
		
	}

}

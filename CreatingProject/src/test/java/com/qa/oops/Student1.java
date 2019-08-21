package com.qa.oops;

public class Student1 {
	
	int sid;
	String sname;
	int sub1;
	int sub2;
	int sub3;
	int sum;  


	Student1(int id, String name)
	{
		sid=id;
		sname=name;
		System.out.println(sid+"   "+sname);
	}
	 
      Student1(int marks1, int marks2, int marks3)
	{
		sub1=marks1;
		sub2=marks2;
		sub3=marks3;
		System.out.println(sub1+"  "+sub2+"  "+sub3);
	}
	
	void totalmarks()
	{
		sum=sub1+sub2+sub3;
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		
		//Student1 s = new Student1(10,"mallikarjun");
		Student1 st1 = new Student1(30,40,50);
		st1.totalmarks();
		
	
		
		
	}
	
}
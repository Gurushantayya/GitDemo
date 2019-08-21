package com.qa.oops;

public class Student {

	int sid;
	String sname;
	int sub1;
	int sub2;
	int sub3;
	int sum;   
	
	
	void getdata(int id, String name)
	{
		sid=id;
		sname=name;
		System.out.println(sid+" "+sname);
		
	}
	 
	void getmarks(int marks1, int marks2, int marks3)
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
	
	public static void main(String[] args) 
	{
	Student s=new Student();
	s.getdata(100,"mallikarjun");
	s.getmarks(60,70,75);
	s.totalmarks();
		
	}
	
	
}

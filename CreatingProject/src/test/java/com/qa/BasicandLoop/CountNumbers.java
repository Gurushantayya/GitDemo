package com.qa.BasicandLoop;

public class CountNumbers {

	public static void main(String[] args) {
		
		int count=0;
	int num=12345;
	
	while(num!=0)
	{
	num/=10;
	++count;
	}
	System.out.println("number of digits");
	System.out.println(count);
	
	}

}
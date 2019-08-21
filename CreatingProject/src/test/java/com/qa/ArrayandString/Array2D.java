package com.qa.ArrayandString;

public class Array2D {

	public static void main(String[] args) {
		
		/*int a[][] = new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		*/
		int a[][]= {{100,200}, {300,400},{500,600}};
		System.out.println("The size of rows is"+a.length);
		System.out.println("the size of coloumn is"+a[0].length);
		
		
	/*	for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++ )
			{
				System.out.println(a[i][j]);
			}
		}
		*/
		
		for(int r[]: a)
		{
			for(int i:r)
			{
				System.out.println(i);
			}
		}
		
		
		

	}

}

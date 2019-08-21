package com.qa.ArrayandString;

public class Ass1 {

	public static void main(String[] args) {
		
		
		int a[][]= {{10,20},{30,40}};	
		int b[][]= {{50,60},{70,80}};
		int c[][]=new int [2][2];

		
		/*for(int i=0; i<a.length; i++)
{
	     for(int j=0; j<a[0].length; j++)
	     {
	    	 System.out.println(a[i][j]);
	    	 
	     }
}
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<b[0].length; j++)
		     {
		    	 System.out.println(b[i][j]);  
		}
		
		}
		*/
		       for(int i=0; i<c.length; i++)
		       {
		    	   for(int j=0; j<c[0].length; j++)
		    	   {
		    		   
		    		   c[i][j]=a[i][j]+b[i][j];
		    	   System.out.println(c[i][j]);
		       }
		
	}

}
}

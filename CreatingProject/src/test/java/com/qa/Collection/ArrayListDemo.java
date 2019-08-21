package com.qa.Collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		

		ArrayList <String> list=new ArrayList <String>();
		list.add("John");
		list.add("smith");
		list.add("David");
		list.add("Finch");
		list.add("Cena");
		
		
		System.out.println(list.size());
		System.out.println("Before removing element is "+list);
		
		for(Object o:list)     //we took object here
		{
			System.out.println(o);
		}
		
		
		}

}

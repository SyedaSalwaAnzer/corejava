package com.eminent.com;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		
		
	 System.out.println("Enter number of elements in an array:");
	 
	 Scanner scanner=new Scanner(System.in);
	 
	 int number=scanner.nextInt();
	 
	 int a[]=new int[number];
	 
	 System.out.println("Enter your elements");
	 
	  for(int i=0;i<number;i++)
	  {
		 a[i]=scanner.nextInt();
	  }
	  
	  System.out.println("Print even Numbers");
	  
	  for(int i=0;i<number;i++)
	  {
		  if(a[i]%2==0)
		  {
			  System.out.println(a[i]);
		  }
	  }
		 System.out.println("Print odd Numbers");
		 for(int i=0;i<number;i++)
		 {
			 if(a[i]%2!=0)
			 {
				 System.out.println(a[i]);
			 }
		 }
	}

}

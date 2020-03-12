package com.eminent.com;

import java.util.Scanner;

public class AcendingOrder {

	public static void main(String[] args) {
		
		
		int i;
		int j;
		int temp;
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENter size of the array");
        int size=scanner.nextInt();
        System.out.println("Enter elements");
        
        int[] a=new int[size];
        for( i=0;i<size;i++)
        {
        	a[i]=scanner.nextInt();
        }
        System.out.println("The elements are ");
        for(i=0;i<size;i++)
        {
        	System.out.print(a[i]+"");
        }
        System.out.println("");
        System.out.println("Acending Order");
        for( j=0;j<size;j++)
        {
        	for(i=j;i<size-1;i++)
        	{
        		if(a[j]>a[i+1])
        		{
        			temp=a[j];
        			a[j]=a[i+1];
        			a[i+1]=temp;
        		}
        	}
        	
        }
        for( i=0;i<size;i++)
        {
        	System.out.print(a[i]+"");
        	
        }
        System.out.println("");
        System.out.println("Decending Order");
        
        for(j=0;j<size;j++)
        {
        	for( i=j;i<size-1;i++)
        	{
        		if(a[j]<a[i+1])
        		{
        			temp=a[j];
        			a[j]=a[i+1];
        			a[i+1]=temp;
        		}
        	}
        }
        for( i=0;i<size;i++)
        {
        	System.out.print(a[i]+"");
        }
        
	}

}

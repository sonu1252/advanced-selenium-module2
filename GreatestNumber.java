package com.javaassignment;
import java.util.*;


public class GreatestNumber {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("enter a" );
		a=sc.nextInt();
		System.out.println("enter b" );
		b=sc.nextInt();
		System.out.println("enter c" );
		c=sc.nextInt();
		
		
		
		if (a>b) 
		{
		if (a>c) 
		{
			System.out.println("a is greatest number: " );
			
     	}
		
		else 
     	{
     		System.out.println("c is greatest number: ");
     		//c=sc.nextInt();
		}
		}
		
		else {
			
			if (b>c) {
				System.out.println("b is greates nuber: ");
				//b=sc.nextInt();
			}
			
			else {
				System.out.println("C1 is greatest nuber: ");
				//c=sc.nextInt();
			}
		}
		
		
		
	}

}

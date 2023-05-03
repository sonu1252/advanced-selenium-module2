package com.javaassignment;
import java.util.Scanner;
/*
 *In fibonacci series, 
 *next number is the sum of previous two numbers 
 *for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
 *The first two numbers of fibonacci series are 0 and 1. 
 */
public class FibonacciSeries {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=0,b=1,c,i=1,no;
	
	System.out.print("the number till :");
	no=sc.nextInt();
	
	System.out.println("display fibonacci series :");
	System.out.println(a);
	System.out.println(b);
	while (i<=no) 
	{
	c=a+b;
	a=b;
	b=c;
	System.out.println(c);
	i++;
	
	}
}
}

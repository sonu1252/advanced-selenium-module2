package com.javaassignment;
import java.util.Scanner;
/*
 * An Armstrong number is defined as the sum of nth
*power of each digit to a n digit number is
equal to that number. Let N=abc
is a three number which is an Armstrong number, 
so the mathematical form of the number is
N=a3+b3+c3, if N=abcd be a four digit
number then we have N=a4+b4+c4+d4,
similarly for five, six, seven and so on…
Let us explain the definition using the example.
Suppose we take a 
number N=153 which is three-digit number,
 */

public class ArmstorngNumber {
	public static void main(String[] args)
	
	{
		Scanner sc=new Scanner(System.in);
	    int no,num,rem,cube,sum=0;
	    
	    System.out.println("enter the value no :");
	    no=sc.nextInt();  
	    num=no;
	    //my_temp = my_input;
		while (no!=0) 
		{
		rem=no%10;
		no=no/10;
		cube=(rem*rem*rem);
		sum=(sum+cube);
		}
		if (sum==num) 
		{
		System.out.println(num+" armstrong no");	
		}
		else 
		{
			System.out.println(num+" not armstrong no");	
		}
		
		  
	}

}

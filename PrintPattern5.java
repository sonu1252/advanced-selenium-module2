package com.javaassignment;

public class PrintPattern5 {
	public static void main(String[] args) 
	{
		for (int i = 1; i <=4; i++)
		{
		for (int k = i; k<=4; k++) {
		System.out.print(" ");
		}
		for (int j = i; j >=1 ; j--)
		{
		System.out.print(i+" ");				
		}
		System.out.println();
		}		
		//for (int i = 3; i >=1; i--)
		//{
		//for (int k = i; k<=4; k++) {
		//System.out.print(" ");
		//}
		//for (int j = i; j >=1 ; j--)
		//{
		//System.out.print("*"+" ");				
		//}
		//System.out.println();
		}
	}



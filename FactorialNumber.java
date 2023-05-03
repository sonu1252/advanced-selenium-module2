package com.javaassignment;
import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 int fact=0;
		 int no;
		 
		 System.out.println("enter the number: ");
		 no=sc.nextInt();
		 System.out.println("enter the number: ");
		 fact=sc.nextInt();
		 
		 for (int i=no;i>=1;i--) {
			 fact=fact*i;
			 }
System.out.println("The Factorial number is :"+fact);

}
	
}

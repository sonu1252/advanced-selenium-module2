package com.javaassignment;
/*A prime number is a whole number greater than 1 
 * whose only factors are 1 and itself. 
 * A factor is a whole number 
 * that can be divided evenly into another number. 
 * The first few prime numbers are 2, 3, 5, 7, 11,
 * 13, 17, 19, 23 and 29.
 * Numbers that have more than two
 * factors are called composite numbers.
 */




import java.util.*;
public class PrimeNumerOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no,flag=1;
		System.out.println("enter the value: ");
		no=sc.nextInt();
		
		
		for (int i=2; i < no; i++){
			if (no%i==0) {
				flag=0;
				}
			}
		if (flag==1) {
			System.out.println("prime no");
			
		}
		else {
			System.out.println("not a prime");
		}
	}

}

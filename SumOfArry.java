package com.javaassignment;
import java.util.Scanner;
public class SumOfArry {
	
	    public static void main(String[] args) {
		System.out.println("Enter the required size of the array :: ");
		Scanner s = new Scanner(System.in);
		int a =s.nextInt();
		int b[] = new int [a];
		int sum=0;
	
		System.out.println("Enter the elements of the array one by one ");


for (int i =0; i <a ; i++) {
	b[i]=s.nextInt();
	sum=sum+b[i];
	
	}

System.out.println("sum Elements of the array are: "+sum);

	}

}

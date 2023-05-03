package com.javaassignment;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MarksSheet {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	
	

	int roll_n;
	String name;
	System.out.println("enter the student name");
	name= sc1.nextLine();
	System.out.println("enter the roll_no ");
	roll_n=sc.nextInt();
	
	
	
	
	
	double maths1,englis,hindi,computer,maths2,total=0,avg=0;
	//Scanner sc=new Scanner(System.in);
	
	System.out.println("=================== ");
	System.out.println("Enter englis marks :");
	englis=sc.nextDouble();
	System.out.println("Enter hindi marks :");
	hindi=sc.nextDouble();
	System.out.println("Enter computer marks :");
	computer=sc.nextDouble();
	System.out.println("Enter Maths1 marks :");
	maths1=sc.nextDouble();
    System.out.println("Enter Maths2 marks :");
	maths2=sc.nextDouble();
	
	
	total=(maths1+maths2+englis+hindi+computer);
	avg=(total/5);
	System.out.println("==================");
	System.out.println("enter the student name "+name);
	System.out.println("enter the roll_no "     +roll_n);
	System.out.println("Maths1 marks "          +maths1);
	System.out.println("Maths2 marks "          +maths2);
	System.out.println("Computer marks "        +computer);
	System.out.println("Hindi marks "           +hindi);
	System.out.println("English marks "         +englis);
	System.out.println("===============================");
	System.out.println("total marks "           +total);
	System.out.println("avg marks "             +avg);
	System.out.println("===============================");
	
	
	if (avg>=91 && avg<=99) {
		System.out.println("AA GRADE");
	} 
	else if (avg>=81 && avg<=90) {
		System.out.println("AB GRADE");
	}else if (avg>=71 && avg<=80) {
		System.out.println("BB GRADE");
	}else if (avg>=61 && avg<=70) {
		System.out.println("AC GRADE");
	}else if (avg>=41 && avg<=50) {
		System.out.println("CD GRADE");
	}if (avg<=40) {
	System.out.println("FAIL");
		
	}

		
}
	
	
}

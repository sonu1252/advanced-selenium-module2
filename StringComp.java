package com.javaassignment;

public class StringComp {
	public static void main(String args[]){
	      String str = "abhishek sonar";
	      String anotherString = "abhishek s sonar";
	      Object objStr = str;
	      System.out.println( str.compareTo(anotherString) );
	      System.out.println( str.compareToIgnoreCase(anotherString) );
	      System.out.println( str.compareTo(objStr.toString()));
	   }

}

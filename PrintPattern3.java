package com.javaassignment;

public class PrintPattern3 {
	public static void main(String[] args) {
		   int i,j,x,y;	
		     for ( i=1; i <=6; i++) 
		{
		 if (i%2==0) 
		{
		       x = 1;
		       y = 0;
		}
		 else
		{
		     x = 0;
		     y = 1;
		}
		 for ( j =1; j <=i; j++) 
		{
		 if (j%2==0) 
		{
		     System.out.print(x);
		}
		 else 
		{
		     System.out.print(y);		
		}
		}
		     System.out.println();
		}	
		}

	}



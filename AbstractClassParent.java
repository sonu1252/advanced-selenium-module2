package com.javaassignment;
abstract class Parent
{  
abstract void Display();  
}    
class Subclass1 extends Parent
{  
void Display(){
	//System.out.println("This is first subclass");
	} 
}  
class subclass2 extends Parent
{  
void Display()
{
System.out.println("This is first subclass");
System.out.println("This is Scond subclass");
}  
}    
public class AbstractClassParent {  
public static void main(String args[])
{  
	Parent p=new subclass2();
  p.Display();  
		}  
			}  



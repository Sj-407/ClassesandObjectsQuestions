//Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. 
//First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle.
//Length and breadth of rectangle are entered through keyboard.

package oop.classesandobjects;

import java.util.Scanner;

public class Area {
	
	int length, breadth;
	static int area; 
	
	
	public void setDim (int l, int b) {
		length = l;
		breadth = b;
	}
	
	public int getArea () {
		return (length*breadth);
		}
	
	public static void main (String [] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length");
		int length = sc.nextInt();
		
		System.out.println("Enter the width");
		int breadth = sc.nextInt(); 
		
		area = length* breadth;
	    System.out.println("Area of the rectangle is ::"+area);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

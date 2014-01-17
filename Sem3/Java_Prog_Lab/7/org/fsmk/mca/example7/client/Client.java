package org.fsmk.mca.example7.client;

import java.util.Scanner;

import org.fsmk.mca.example7.shape.IShape;
import org.fsmk.mca.example7.shape.Circle;
import org.fsmk.mca.example7.shape.Rectangle;
import org.fsmk.mca.example7.shape.Square;
import org.fsmk.mca.example7.shape.Triangle;

public class Client 
{
	
	private static Scanner scanner;
	
	public static void main(String[] args)
	{
		
		while(true)
		{
			// Initialize Scanner to get inputs from the console/STDIN
			scanner = new Scanner(System.in);
	
			System.out.println("Welcome to the program to demonstrate usage of classes from another package.");
	        System.out.println("1. Square");
	        System.out.println("2. Rectangle");
	        System.out.println("3. Circle");
	        System.out.println("4. Triangle");
	        System.out.println("5. Exit the program!!!");
	        System.out.println("Please select one of the option given below to choose the shape for which you want to find the area or perimeter.");
	        System.out.println("Your option: ");
	        
	        int shape_choice = scanner.nextInt();
	        switch(shape_choice)
	        {
	        	case 1:
	        	{
	        		System.out.println("Enter the side of the square:");
	        		int side = scanner.nextInt();
	        		Square square = new Square(side);
	        		calcValue(square);
	        		break;
	        	}
	        	case 2:
	        	{
	        		System.out.println("Enter the length of the rectangle:");
	        		int length = scanner.nextInt();
	        		System.out.println("Enter the breadth of the rectangle:");
	        		int breadth = scanner.nextInt();
	        		Rectangle rect = new Rectangle(length, breadth);
	        		calcValue(rect);
	        		break;
	        	}
	        	case 3:
	        	{
	        		System.out.println("Enter the radius of the circle:");
	        		int radius = scanner.nextInt();
	        		Circle circle = new Circle(radius);
	        		calcValue(circle);
	        		break;
	        	}
	        	case 4:
	        	{
	        		System.out.println("Enter the length of the first side of the triangle:");
	        		int first = scanner.nextInt();
	        		System.out.println("Enter the length of the second side of the triangle:");
	        		int second = scanner.nextInt();
	        		System.out.println("Enter the length of the third side of the triangle:");
	        		int third = scanner.nextInt();
	        		Triangle triangle = new Triangle(first, second, third);
	        		calcValue(triangle);
	        		break;
	        	}
	        	case 5:
	        	{
	        		System.out.println("Program is exitting!!!");
	        		System.exit(0);
	        	}
	        
	        }
		}
        
        
	}

	private static void calcValue(IShape shape) {
		System.out.println("Area of "+shape.getName()+" is :"+shape.calcArea());
		System.out.println("Perimeter of "+shape.getName()+" is :"+shape.calcPerimeter());
		System.out.println("\n\n");
	}

}

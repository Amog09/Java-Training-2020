package com.prac.traning.java.geo;

public class Circle extends Shape{

	final static double  d = Math.PI;
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
		
	public Circle() {
		System.out.println("Circle default constructor");
		this.radius =5;
		
	}

	@Override
	public void calShapeArea() {
		System.out.println("Given radius: " + radius);
		System.out.printf("The area of a circle: " + d *(radius*radius)+ "\n");
		
	}
}

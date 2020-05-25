package com.prac.traning.java.geo;

public class Triangle extends Shape {

	private int length;
	private int heigth;
	
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public Triangle(int length, int heigth) {
		this.length = length;
		this.heigth = heigth;
	}
	public Triangle() {
		System.out.println("Triangle default constructor .");
		this.heigth= 15;
		this.length=12;
	}

	@Override
	public void calShapeArea() {
		System.out.println(" Triangle length: " + this.length + "\nTriangle height: " + this.heigth);
		int total = (this.length * this.heigth) / 2;
		System.out.println("The area of a triangle is: " + total+ "\n");
	}
}

package com.prac.traning.java;

public class Rectangle {
	private int length;
	private int breadth;

	public Rectangle() {
		System.out.println("Default Constructor");
	}

	public Rectangle(int length, int breadth) {
		System.out.println("Input Constructor");
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public void areaCal() {
		System.out.println("Default length = " + this.length + " \nDefault breadth = " + this.breadth);
		System.out.println("Total area of a rectangle is: " + this.getLength() * this.getBreadth()+ "\n");
	}

	public void display() {

	}

	public String toString() {
		return "The total area of the rectangle is: " + this.length * this.breadth;
	}

}

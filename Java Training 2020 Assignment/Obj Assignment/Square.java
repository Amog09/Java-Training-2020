package com.prac.traning.java.geo;

public class Square extends Rectangle {

	public boolean isSquare() {
		if (this.getLength() == this.getBreadth()) {
			System.out.println(" Figure" + " is a square.");
			return true;
		} else {
			System.out.println("Figure is not a square.");

			return false;
		}

	}

	@Override
	public void areaCal() {
		if (isSquare()) {
			System.out.println("Length: " + this.getLength());
			System.out.println("Breadth: " + this.getBreadth());
			System.out.println("Area of the square is " + this.getLength() * this.getBreadth()+"\n");
		} else {
			System.out.println("Cannot process if not square.\n");
		}
	}

	@Override
	public void calShapeArea() {
		areaCal();

	}
}

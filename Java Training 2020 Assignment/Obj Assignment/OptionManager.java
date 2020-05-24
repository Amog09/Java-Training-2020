package com.prac.core.traning.option;

import java.util.Scanner;

import com.prac.traning.java.Rectangle;

public class OptionManager {

	public Rectangle createRectangle() {

		System.out.println("Enter the length..");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();

		System.out.println("Enter the breadth");
		int bread = sc.nextInt();

		Rectangle rec = new Rectangle();
		rec.setLength(len);
		rec.setBreadth(bread);
		calArea(rec);
		return rec;

	}

	public Rectangle defaultRecValue() {
		Rectangle rec1 = new Rectangle(25, 35);
		rec1.areaCal();
		return rec1;

	}

	public void calArea(Rectangle rec) {
		int total = rec.getLength() * rec.getBreadth();
		System.out.println("Total area of a rectangle is : " + total);
	}

	public void showRectangle(Rectangle rec) {
		System.out.println("The length of the Rectangle is: " + rec.getLength());
		System.out.println("The breadth of the Rectangle is: " + rec.getBreadth());
	}

}

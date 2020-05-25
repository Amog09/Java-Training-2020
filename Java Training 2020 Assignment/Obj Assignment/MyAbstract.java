package com.prac.core.traning.driver;

import com.prac.traning.java.geo.Rectangle;
import com.prac.traning.java.geo.Square;

public class MyAbstract {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		r1.calShapeArea();
		r1.displayArea();
		//implicit casting
		Rectangle s1 = new Square();
		s1.areaCal();
		//explicit casting
		System.out.println(((Square)s1).isSquare());
	}

}

package com.prac.core.traning.driver;

import com.prac.core.traning.option.ShapeManager;
import com.prac.traning.java.geo.Circle;
import com.prac.traning.java.geo.Rectangle;
import com.prac.traning.java.geo.Shape;
import com.prac.traning.java.geo.Square;
import com.prac.traning.java.geo.Triangle;

public class InheritanceDriver {
	
	public static void main(String[] args) {
		
		Square s1= new Square();
		s1.setBreadth(13);
		s1.setLength(13);
		s1.areaCal();
		
		ShapeManager sm = new ShapeManager();
		sm.calShapeArea(s1);
		
		Triangle t1  = new Triangle();
		t1.calShapeArea();
		
		Circle c1 = new Circle();
		c1.calShapeArea();
		Circle c2 = new Circle(12);
		c2.calShapeArea();
		
		ShapeManager sm2 = new ShapeManager();
		sm2.calShapeArea(c1);

	}
}

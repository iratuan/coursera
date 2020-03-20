package org.coursera.dukejava.cour01.week01.tests;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.DecimalFormat;

import org.coursera.dukejava.cour01.week01.PerimeterAssignmentRunner;
import org.coursera.dukejava.cour01.week01.Point;
import org.coursera.dukejava.cour01.week01.Shape;
import org.junit.jupiter.api.Test;

class TestPerimeter {

	@Test
	void test() {
		Point p1 = new Point(-3,-3);
		Point p2 = new Point(-4,-3);
		Point p3 = new Point(4,-2);
		Point p4 = new Point(6,5);
		
		Shape shape = new Shape();
		shape.addPoint(p1);
		shape.addPoint(p2);
		shape.addPoint(p3);
		shape.addPoint(p4);
		
		PerimeterAssignmentRunner perimeter = new PerimeterAssignmentRunner();
		Double result =  perimeter.getPerimeter(shape);
		DecimalFormat formatter = new DecimalFormat("#.##");

		System.out.println(result);
		assertEquals(formatter.format(28.38),formatter.format(result));
	}
}

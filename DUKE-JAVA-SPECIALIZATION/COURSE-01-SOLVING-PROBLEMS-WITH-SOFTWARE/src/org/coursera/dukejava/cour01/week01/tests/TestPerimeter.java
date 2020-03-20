package org.coursera.dukejava.cour01.week01.tests;


import org.coursera.dukejava.cour01.week01.Perimeter;
import org.coursera.dukejava.cour01.week01.Point;
import org.junit.jupiter.api.Test;

class TestPerimeter {

	@Test
	void test() {

		Point p1 = new Point(-3,-4);
		Point p2 = new Point(3,4);
		Point p3 = new Point(-3,4);
		
		Perimeter perimeter = new Perimeter();
		perimeter.addPoint(p1);
		perimeter.addPoint(p2);
		perimeter.addPoint(p3);
		
		System.out.println(perimeter.calcPerimeter());
		
		
	}

}

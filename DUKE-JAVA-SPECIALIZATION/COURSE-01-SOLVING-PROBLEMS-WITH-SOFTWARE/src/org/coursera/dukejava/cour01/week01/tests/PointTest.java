package org.coursera.dukejava.cour01.week01.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.coursera.dukejava.cour01.week01.Point;
import org.junit.jupiter.api.Test;

class PointTest {

	@Test
	void testaDistanciaEntrePontos() {
		Point p1 = new Point(2,3);
		Point p2 = new Point(5,7);
		assertEquals(5,p1.getDistance(p2));
	}

}

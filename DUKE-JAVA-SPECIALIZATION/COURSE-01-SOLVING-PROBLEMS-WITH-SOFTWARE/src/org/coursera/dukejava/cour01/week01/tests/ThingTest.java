package org.coursera.dukejava.cour01.week01.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.coursera.dukejava.cour01.week01.Thing;
import org.junit.jupiter.api.Test;

class ThingTest {

	@Test
	void testThing() {
		Thing a = new Thing(6);
		Thing b = new Thing(8);
		assertEquals(14, a.combine(b));
	}

}

package org.coursera.dukejava.cour01.week01.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.DecimalFormat;

import org.coursera.dukejava.cour01.week01.Shape;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class TestPerimeter {
	DecimalFormat formatter = new DecimalFormat("#.##");
	String path1 = "//Volumes//Dados//Estudos//Coursera//DUKE-JAVA-SPECIALIZATION//COURSE-01-SOLVING-PROBLEMS-WITH-SOFTWARE/data/datatest1.txt";
	String path2 = "//Volumes//Dados//Estudos//Coursera//DUKE-JAVA-SPECIALIZATION//COURSE-01-SOLVING-PROBLEMS-WITH-SOFTWARE/data/datatest2.txt";
	String path3 = "//Volumes//Dados//Estudos//Coursera//DUKE-JAVA-SPECIALIZATION//COURSE-01-SOLVING-PROBLEMS-WITH-SOFTWARE/data/datatest3.txt";
	String path4 = "//Volumes//Dados//Estudos//Coursera//DUKE-JAVA-SPECIALIZATION//COURSE-01-SOLVING-PROBLEMS-WITH-SOFTWARE/data/datatest4.txt";
	String path5 = "//Volumes//Dados//Estudos//Coursera//DUKE-JAVA-SPECIALIZATION//COURSE-01-SOLVING-PROBLEMS-WITH-SOFTWARE/data/datatest5.txt";
	String path6 = "//Volumes//Dados//Estudos//Coursera//DUKE-JAVA-SPECIALIZATION//COURSE-01-SOLVING-PROBLEMS-WITH-SOFTWARE/data/datatest6.txt";
	Shape s1 =  new Shape(path1);
	Shape s2 =  new Shape(path2);
	Shape s3 =  new Shape(path3);
	Shape s4 =  new Shape(path4);
	Shape s5 =  new Shape(path5);
	Shape s6 =  new Shape(path6);
	
	@Before
	void setup() {
		formatter = new DecimalFormat("#.##");
	}

	@Test
	void testPerimeter() {
		
		double result = s1.getPerimeter();
		assertEquals("30.64", formatter.format(result));
	}
	
	@Test
	void testAverage() {
		
		double result = s1.getAverageLength();
		assertEquals("7.66", formatter.format(result));
	}
}

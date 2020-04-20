package org.coursera.dukejava.cour01.week01.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.DecimalFormat;

import org.coursera.dukejava.cour01.week01.Shape;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class TestPerimeter {
	DecimalFormat formatter = new DecimalFormat("#.##");
	String pathSystem ="//Volumes//Dados//Estudos//Coursera//DUKE-JAVA-SPECIALIZATION//COURSE-01-SOLVING-PROBLEMS-WITH-SOFTWARE/data/";
//	String pathSystem ="C:\\Coursera\\coursera\\DUKE-JAVA-SPECIALIZATION\\COURSE-01-SOLVING-PROBLEMS-WITH-SOFTWARE\\data\\";
	String path1 = pathSystem + "datatest1.txt";
	String path2 = pathSystem + "datatest2.txt";
	String path3 = pathSystem + "datatest3.txt";
	String path4 = pathSystem + "datatest4.txt";
	String path5 = pathSystem + "datatest5.txt";
	String path6 = pathSystem + "datatest6.txt";
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
		assertEquals("30,64", formatter.format(result));
	}
	
	@Test
	void testAverage() {
		
		double result = s1.getAverageLength();
		assertEquals("7,66", formatter.format(result));
	}
}

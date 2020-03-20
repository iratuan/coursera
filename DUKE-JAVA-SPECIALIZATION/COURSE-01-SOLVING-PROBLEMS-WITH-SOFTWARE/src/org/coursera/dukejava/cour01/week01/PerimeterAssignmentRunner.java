package org.coursera.dukejava.cour01.week01;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PerimeterAssignmentRunner {
	private File temp;

	private List<Double> sides = new ArrayList<Double>();

	public int getNumPoints(Shape s) {
		// Put code here
		return 0;
	}

	public double getLargestSide(Shape s) {
		// Put code here
		return 0.0;
	}

	public double getLargestX(Shape s) {
		// Put code here
		return 0.0;
	}

	public double getLargestPerimeterMultipleFiles() {
		// Put code here
		return 0.0;
	}

	public String getFileWithLargestPerimeter() {
		temp = null;
		return temp.getName();
	}

	public void testPerimeterMultipleFiles() {
		// Put code here
	}

	public void testFileWithLargestPerimeter() {
		// Put code here
	}

	// This method creates a triangle that you can use to test your other methods
	public void triangle() {
		Shape triangle = new Shape();
		triangle.addPoint(new Point(0, 0));
		triangle.addPoint(new Point(6, 0));
		triangle.addPoint(new Point(3, 6));
		for (Point p : triangle.getPoints()) {
			System.out.println(p);
		}
		double peri = triangle.getPerimeter();
		System.out.println("perimeter = " + peri);
	}

	public List<Double> getSides() {
		return sides;
	}

	public void addSide(List<Double> sides) {
		this.sides = sides;
	}
}

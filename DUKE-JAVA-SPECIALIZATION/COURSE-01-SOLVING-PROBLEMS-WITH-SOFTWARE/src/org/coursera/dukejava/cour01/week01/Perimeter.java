package org.coursera.dukejava.cour01.week01;

import java.util.ArrayList;
import java.util.List;

public class Perimeter {
	private List<Point> points = new ArrayList<Point>();
	private Double result;

	public Perimeter() {
	}

	public void addPoint(Point p) {
		this.points.add(p);
	}

	public Double calcPerimeter() {
		result = points.get(0).getDistance(points.get(points.size()));

		for (int i = 0; i < this.points.size(); i++) {
			if (i < points.size()-1) {
				Point p1 = points.get(i);
				Point p2 = points.get(i + 1);
				System.out.println("--------------------");
				System.out.println(p1);
				System.out.println(p2);
				result += p1.getDistance(p2);
			}
		}
		return result;
	}

	public static void main(String args[]) {
		Point p1 = new Point(-3, 4);
		Point p2 = new Point(-3, -4);
		Point p3 = new Point(3, -4);

		Perimeter perimeter = new Perimeter();
		perimeter.addPoint(p1);
		perimeter.addPoint(p2);
		perimeter.addPoint(p3);

		System.out.println(perimeter.calcPerimeter());
	}
}

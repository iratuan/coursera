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
		result = points.get(0).getDistance(points.get(points.size()-1));
		for (int i = 0; i < this.points.size(); i++) {
			if (i < points.size()-1) {
				Point p1 = points.get(i);
				Point p2 = points.get(i + 1);
				result += p1.getDistance(p2);
			}
		}
		return result;
	}
}

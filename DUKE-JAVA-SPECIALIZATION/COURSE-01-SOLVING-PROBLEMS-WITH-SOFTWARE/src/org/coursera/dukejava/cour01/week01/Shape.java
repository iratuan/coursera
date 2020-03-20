package org.coursera.dukejava.cour01.week01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shape {
	private List<Point> points = new ArrayList<Point>();
	private Scanner sc;

	public Shape() {

	}

	public Shape(String path) {
		File file = new File(path);
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		sc.useDelimiter(",");
		while (sc.hasNextLine()) {
			String[] elements = sc.nextLine().toString().split(",");
			points.add(new Point(new Integer(elements[0].trim()), new Integer(elements[1].trim())));
		}
	}

	public void addPoint(Point p) {
		this.points.add(p);
	}

	public List<Point> getPoints() {
		return this.points;
	}

	public Point getLastPoint() {
		return this.points.get(points.size() - 1);
	}

	public double getPerimeter() {
		double perimeter = 0.0;
		Point prevPt = this.getLastPoint();
		for (Point currPt : this.getPoints()) {
			double currDist = prevPt.getDistance(currPt);
			perimeter = perimeter + currDist;
			prevPt = currPt;
		}
		return perimeter;
	}

	public double getAverageLength() {
		double qtdSizes = getPoints().size() - 1 / 2;
		double result = getPerimeter() / qtdSizes;
		return result;
	}

	public int getNumPoints() {
		return this.points.size();
	}
}

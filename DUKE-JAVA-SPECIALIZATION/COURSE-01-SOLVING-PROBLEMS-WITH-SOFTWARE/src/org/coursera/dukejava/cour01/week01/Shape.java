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

	public Shape(String path) throws FileNotFoundException {
		File file = new File(path);
		sc = new Scanner(file);

		while (sc.hasNextLine()) {			
			System.out.println(sc.nextLine());
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

}

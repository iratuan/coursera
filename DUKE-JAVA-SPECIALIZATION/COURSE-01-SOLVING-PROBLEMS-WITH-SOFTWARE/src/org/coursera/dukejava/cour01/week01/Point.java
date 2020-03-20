package org.coursera.dukejava.cour01.week01;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return "X: " + this.x + ", Y: " + this.y;
	}
	
	public Double getDistance(Point p) {
		int distanceX = this.x - p.getX();
		int distanceY = this.y - p.getY();
		Double distance = Math.sqrt(distanceX*distanceX + distanceY*distanceY);
		return distance;
	}

}

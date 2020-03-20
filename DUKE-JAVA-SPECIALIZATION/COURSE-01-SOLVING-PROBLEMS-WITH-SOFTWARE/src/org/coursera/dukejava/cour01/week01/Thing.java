package org.coursera.dukejava.cour01.week01;

public class Thing {
	private int a;
	
	public Thing(int a) {
		this.a = a;
	}
	
	public int combine(Thing y) {
		return a + y.getA();
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
}

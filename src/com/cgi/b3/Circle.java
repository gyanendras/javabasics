package com.cgi.b3;

public class Circle {
	private int r;
	
	Circle(){
		r = 2;
	}
	
	Circle(int r){
		this.r = r;
	}
	
	
	public double area() {
		double x = 3.14*r*r;
		return x;
	}
	

	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println("Area is " + c.area());
		
		Circle c2 = new Circle(4);
		System.out.println("Area is " + c2.area());

	}

}

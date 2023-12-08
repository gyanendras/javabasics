package com.cgi.b3;

public class Circle {
	private int r;
	final float pi ;
	
	Circle(){
		r = 2;
		pi=3.1456789f;
	}
	
	Circle(int r){
		this.r = r;
		pi=3.1456789f;
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

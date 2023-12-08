package com.cgi.b3;

public class Circle {
	private int r;
	private String color;
	private String material;
	
	final float pi ;
	
	Circle(){
		r = 2;
		pi=3.1456789f;
	}
	
	Circle(int r){
		this.r = r;
		pi=3.1456789f;
	}
	
	Circle(int r, String color, String material){
		this.r = r;
		this.color = color;
		this.material = material;
		pi=3.1456789f;
	}
	
	public double area() {
		double x = 3.14*r*r;
		return x;
	}
	
	@Override
	public boolean equals(Object obj) {
		Circle c2 = (Circle)obj;
		return this.r == c2.r && this.color.equals(c2.color);
		
		
	}
	
	//if two equal return true then there hashcode be same.
	@Override
	public int hashCode() {
		return this.r+this.color.length();
		
	}
	

	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		System.out.println("Area is " + c.area());
		
		Circle c2 = new Circle(4);
		System.out.println("Area is " + c2.area());

	}

}

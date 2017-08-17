package com.oocl.ita.yapojo.sw;

public class Shape {
	private Shape shape;
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	public Shape getShape() {
		return shape;
	}
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public void draw() {
		shape.draw();
	}

}

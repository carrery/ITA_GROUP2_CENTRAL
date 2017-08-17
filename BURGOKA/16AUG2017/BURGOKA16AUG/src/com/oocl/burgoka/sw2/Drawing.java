package com.oocl.burgoka.sw2;

public class Drawing {

	private Shape shape;
	
	public Drawing() {
		// TODO Auto-generated constructor stub
	}
	
	public void setShape(Shape shape){
		System.out.println("Shape...");
		this.shape = shape;
	}
	
	public Shape getDraw() {
		return shape;
	}
	
	public void drawing(Shape shape) {
		System.out.println("Shape " + shape.hugis);
	}
}

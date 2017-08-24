package com.oocl.burgoka.sw1;

public class Cycle {
	
	public String ride() {
		return "Ride";
	}
	
	 public static void main(String args[]) {
		 Bicycle bi = new Bicycle();
		 Tricycle tr  = new Tricycle();
		 Unicycle un = new Unicycle();
		 
		 Cycle cy1 = (Cycle)bi;
		 Cycle cy2 = (Cycle)tr;
		 Cycle cy3 = (Cycle)un;
		 
		 System.out.println(cy1.ride());
		 System.out.println(cy2.ride());
		 System.out.println(cy3.ride());
	 }
}

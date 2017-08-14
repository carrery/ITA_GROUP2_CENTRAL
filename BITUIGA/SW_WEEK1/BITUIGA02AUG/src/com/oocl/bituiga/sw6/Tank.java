package com.oocl.bituiga.sw6;

public class Tank {
	static boolean isEmpty;
	
	public Tank() {
		System.out.println("Tank created.");
		setEmptyState(true);		
	}
	
	public void setEmptyState(boolean isEmp)
	{
		isEmpty = isEmp;
	}
	
	public static boolean getEmptyState()
	{
		return isEmpty;
	}
		
	public void fillTank()
	{
		setEmptyState(false);
		System.out.println("Tank is Filled");
	}
	
	public void emptyTank()
	{
		setEmptyState(true);
		System.out.println("Tank is Empty");
	}
	
	public static void cleanTank()
	{
		System.gc();
		System.out.println("Tank is Cleaned");
	}
	
	public void finalize() {
		System.gc();	
		System.out.println("Terminated. Tank is confirmed clean");
	}
	
	public static void main(String args[]) {
		
		Tank tangc1 = new Tank();
		try {
			
			if(tangc1.getEmptyState())tangc1.fillTank();
			else {
				System.out.println("Tank already full.");
			}
			
			if(tangc1.getEmptyState()) tangc1.cleanTank();
			else {
				tangc1.emptyTank();
				tangc1 = null;
				cleanTank();
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}

package com.oocl.bituiga.sw1;

public class Cycle {	
	
	private void ride()
	{
		System.out.println("Riding Naaaaaooo");
	}
		
	
	public static void main(String args[]) {
		((Cycle)new BiCycle()).ride();
		((Cycle)new  TriCycle()).ride();
		((Cycle) new  UniCycle()).ride();
	}
}

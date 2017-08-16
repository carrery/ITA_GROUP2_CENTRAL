package com.oocl.bituiga.sw2;

import com.oocl.bituiga.sw1.*;

public class CallTheBikes {
	
	public static void main(String args[]) {
		
		Cycle[] cycles = new Cycle[3];
		
		cycles[0] = new BiCycle();
		cycles[1] = new  TriCycle();
		cycles[2] = new  UniCycle();	
		
//		cycles[0].balance();
//		cycles[2].balance();
//		cannot call balance when upcasted
		
		BiCycle bike2 = (BiCycle)cycles[0];
		TriCycle trike2 = (TriCycle)cycles[1];
		UniCycle uni2 = (UniCycle)cycles[2];
		
		bike2.balance();
		uni2.balance();		
//		can call balance now . because not all Cycles need to balance e.g. Tricycle 
		
	}
}

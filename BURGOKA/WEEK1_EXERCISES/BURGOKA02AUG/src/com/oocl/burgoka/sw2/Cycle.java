package com.oocl.burgoka.sw2;

import java.util.ArrayList;

import com.oocl.burgoka.sw1.Bicycle;
import com.oocl.burgoka.sw1.Tricycle;
import com.oocl.burgoka.sw1.Unicycle;


public class Cycle {	
	
	public static void main(String args[]) {
		com.oocl.burgoka.sw1.Cycle cy[] = new com.oocl.burgoka.sw1.Cycle[3];
		
		cy [0] = new Bicycle();
		cy [1] = new Unicycle();
		cy [2] = new Tricycle();
		
//		for (int i = 0 ; i < 3 ; i++) {
//			cy[i].balance();
//		}
		
		Bicycle bi = (Bicycle) cy[0];
		Unicycle un = (Unicycle) cy[1];
		//Tricycle tr = (Tricycle) cy[2];
		System.out.print(bi.balance());
		System.out.print(un.balance());
		//tr.balance();
		
		
/*		try {
			Bicycle b = (Bicycle) cy[1];	
		}catch(ClassCastException e) {
			System.out.println(e);
		}  
		System.out.println("Testing");*/
	}


}

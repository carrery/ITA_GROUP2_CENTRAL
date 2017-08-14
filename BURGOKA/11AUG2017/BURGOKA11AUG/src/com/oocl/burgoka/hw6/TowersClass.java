package com.oocl.burgoka.hw6;

public class TowersClass {

	public void arrange(int n, String start, String auxiliary, String end) {
		// TODO Auto-generated method stub
		if (n == 1) {
	           System.out.println("Disk 1 from " + start + " -> " + end);
	       } else {
	           arrange(n - 1, start, end, auxiliary);
	           System.out.println("Disk " + n +" from " + start + " -> " + end);
	           arrange(n - 1, auxiliary, start, end);
	       }
	}

}

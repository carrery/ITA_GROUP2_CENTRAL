package com.oocl.burgoka.sw1;

import java.util.Comparator;

public class Sort implements Comparable<Sort>{

	private String line;

	public Sort(String line2) {
		this.line = line2;
	}
	
	@Override
	public int compareTo(Sort str) {
		if(this.line == str.line) {
			return 0;
		}
		else {        
			return -1;
		}
	}

}

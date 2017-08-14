package com.oocl.bituiga.sw2;
import com.oocl.bituiga.sw1.HolderClass;

public class MainClas {

	public MainClas() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HolderClass hello = null;
		try {
			System.out.println(hello.getMember(1));
		}
		catch(Exception e) {
			System.out.println("Caught exception: " + e);
		}
		
		
		
	}

}

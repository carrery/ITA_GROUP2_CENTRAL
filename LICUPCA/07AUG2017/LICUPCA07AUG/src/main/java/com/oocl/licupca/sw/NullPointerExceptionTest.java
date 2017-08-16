package com.oocl.licupca.sw;

public class NullPointerExceptionTest {
	
	public static void main(String[] args) {
		
		try {
			NullObject nullObject;
			nullObject = null;
			nullObject.equals(nullObject);
		}
		catch (NullPointerException e) {
			System.out.println();
		}
		finally {
			System.out.println("");
		}
	}

}

class NullObject {
	public NullObject() {
	}
}

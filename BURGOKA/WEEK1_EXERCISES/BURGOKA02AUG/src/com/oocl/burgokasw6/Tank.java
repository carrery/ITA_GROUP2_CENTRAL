package com.oocl.burgokasw6;

public class Tank {
	Boolean filled, notFilled;

	public Tank() {
		this.filled = true;
		this.notFilled = false;
	}
	
	public boolean isEmpty() {
		return notFilled;
	}

	public boolean isFilled() {
		return filled;
	}

	public void toFill() {
		System.out.println("Filled");
		isFilled();
	}

	public void Clean() {
		System.out.print("Tank is cleaned.");
	}

	public void Empty() {
		isEmpty();
		System.out.println("Tank is emptied.");
	}

	public void finalize() throws Throwable {
		System.out.println("\nTerminated...\n");
		super.finalize();
		// System.exit(0);
	}

	public void ToFill() {
		this.filled = true;
		System.out.println("Filled");
	}
	

	public static void main(String args[]) throws Throwable {
		
		Tank tanke = new Tank();

		//System.out.println("Hello" );
		//tanke.ToFill();
		
	
		if (!tanke.isEmpty()) {
			System.out.print("Tank is about to fill : ");
			tanke.toFill();
		}
		
		if (tanke.isFilled()) {
			if (!tanke.isEmpty()) {
				//if (tanke.Clean()) {
					tanke.Empty();
					tanke.Clean();
					tanke.finalize();
				//}
			}
			else {
				tanke = new Tank();
				tanke.Empty();
				tanke.Clean();
				tanke.finalize();
			}
		}
		
		tanke = new Tank();
		
		do {
			if(tanke.isFilled()) {
				System.out.println("Tank is filled");
				System.out.print("Tank is about to empty: ");
				tanke.Empty();
				tanke.Clean();
				tanke.finalize();
				System.gc();
			}
			
		} while (!tanke.isFilled());
		

		/*if (tanke.isEmpty()) {
			if (tanke.Clean()) {
				tanke.finalize();
			}
		}*/
	}

}

package com.oocl.licupca.sw;

class HolderClass<T> {
	private T a, b, c;

	public HolderClass(T a, T b, T c) {
		setA(a);
		setB(b);
		setC(c);
	}

	public void setA(T a) {
		this.a = a;
	}

	public void setB(T b) {
		this.b = b;
	}

	public void setC(T c) {
		this.c = c;
	}

	public T getA() {
		return a;
	}

	public T getB() {
		return b;
	}

	public T getC() {
		return c;
	}
}

public class HolderMain {

	public static void main(String[] args) {
		HolderClass<String> holder = new HolderClass("A", "B", "C");
		System.out.println(holder.getA());
		System.out.println(holder.getB());
		System.out.println(holder.getC());
	}

}

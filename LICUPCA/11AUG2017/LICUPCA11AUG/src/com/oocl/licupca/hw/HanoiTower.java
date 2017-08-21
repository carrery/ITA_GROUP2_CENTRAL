package com.oocl.licupca.hw;

public class HanoiTower {
	public static void move(int n, int startPole, int endPole) {
		String [] poles = {"A","B","C"};
		if (n == 0) {
			return;
		}
		int intermediatePole = 6 - startPole - endPole;
		move(n - 1, startPole, intermediatePole);
		System.out.println("Disc " + n + " from " + poles[startPole-1] + " to " + poles[endPole-1]);
		move(n - 1, intermediatePole, endPole);
	}
	public static void main(String[] args) {
		move(3, 1, 3);
	}
}
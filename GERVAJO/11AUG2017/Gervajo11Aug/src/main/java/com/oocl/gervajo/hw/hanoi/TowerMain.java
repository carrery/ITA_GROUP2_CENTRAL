package com.oocl.gervajo.hw.hanoi;

import java.util.Scanner;

public class TowerMain {
	
	static int disk;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TowerMain tw = new TowerMain();
		System.out.println("Input number of disk: ");
		disk = sc.nextInt();
		tw.move(disk, "A", "B", "C");
	}	
	
	public void move(int disk, String start, String middle, String end) {
		if (disk == 1) {
			System.out.println("Disk " + disk + " from " + start + " to " + end);
		} else {
			move(disk - 1, start, end, middle);
			System.out.println("Disk " + disk + " from " + start + " to " + end);
			move(disk - 1, middle, start, end);
		}
	}
	

	

}

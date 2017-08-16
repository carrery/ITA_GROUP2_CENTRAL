package com.bituiga.hw1;

import java.util.Scanner;

public class TowerOfHanoi {

	private static Tower[] tower = new Tower[4]; 
	private static int numMoves = 0;
    
 
    public static void showTowerStates(int n, int x, int y, int z) {
         
        if (n > 0) {
            try{
                showTowerStates(n - 1, x, z, y);
                Integer d = (Integer) tower[x].pop(); 
                tower[y].push(d); 
                System.out.println("Disc " + d  + " from tower "+ x + " to top of tower " + y);
                numMoves++;
                showTowerStates(n - 1, z, y, x);
            } catch(Exception ex){}
        }
    }
 
    public static void main(String[] args) {
    	
    	System.out.println("Enter number of discs: ");
        Scanner scanner = new Scanner(System.in);
        int numOfDiscs = scanner.nextInt();
        
        for (int i = 0; i <= 3; i++){
            tower[i] = new Tower(4);
        }
        for (int d = numOfDiscs; d > 0; d--){
            tower[1].push(new Integer(d)); 
        }
        
        
        showTowerStates(numOfDiscs, 1, 2, 3);
        
        System.out.println("Number of moves:  " + numMoves);
    }
	   
	
}
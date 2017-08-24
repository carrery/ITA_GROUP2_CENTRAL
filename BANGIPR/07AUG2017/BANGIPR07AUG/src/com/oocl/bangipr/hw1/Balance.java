package com.oocl.bangipr.hw1;

import java.util.Random;

public class Balance {

	
	public static void main(String[] args) {
		
		int defectiveBall = randInt(9,11);
	    int regularBall = randInt(0,1);
	    
	    int ball[] = new int[] {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
	    ball[defectiveBall] = 6 + 2*(regularBall);
	    int ballLoc = 0; int groups = 3;
	    String weight = "?";
	     
	   for (int y =0; y<= (groups-1); y++) {
		   System.out.println("Group" + (y+1));
	    	 
	    	  if(y > 0 && y <2) {
	    		  for(int n = 0; n < 4; n++){
				      System.out.print (" ball " + (n+5));
				      
				    }
	    	  } else if (y >0 && y <3){
	    		  for(int n = 0; n < 4; n++){
				      System.out.print (" ball " + (n+9));
				
				    }
	    	  } else {
	    		  for(int n = 0; n < 4; n++){
				      System.out.print (" ball " + (n+1));
				     
	    		  }
	    	  }
	    	  System.out.println("");
	    }
	  
	   System.out.println("");
	    System.out.println("Groups A and B are the Same. Group C has the defective");
	    

	    int w1groupA = ball[0] + ball[1] + ball[2] + ball[3];
	    int w1groupB = ball[4] + ball[5] + ball[6] + ball[7];
	  
	    int w2groupA = ball[0] + ball[1] + ball[2];
	    int w2groupB = ball[8] + ball[9] + ball[10];
	    int w2groupC = ball[0] + ball[4] + ball[5];
	    int w2groupD = ball[1] + ball[6] + ball[7];
	    int w2groupE = ball[4] + ball[0] + ball[1];
	    int w2groupF = ball[5] + ball[2] + ball[3];
	    

	    if(w1groupA == w1groupB){               
	      if(w2groupA == w2groupB){               
	        if(ball[11] > ball[0]){               
	          ballLoc = 11;
	          weight = "Heavier";
	        }
	        else{                                   
	          ballLoc = 11;
	          weight = "Lighter";
	        }
	      }
	      else if(w2groupA < w2groupB){            
	        if(ball[8] == ball[9]){               
	          ballLoc = 10;
	          weight = "Heavier";
	        }
	        else if(ball[8] > ball[9]){              
	          ballLoc = 8;
	          weight = "Heavier";
	        }
	        else{                                   
	          ballLoc = 9;
	          weight = "Heavier";
	        }
	      }
	      else{                                   
	        if(ball[8] == ball[9]){               
	          ballLoc = 10;
	          weight = "Lighter";
	        }
	        else if(ball[8] < ball[9]){              
	          ballLoc = 8;
	          weight = "Lighter";
	        }
	        else{                                  
	          ballLoc = 9;
	          weight = "Lighter";
	        }
	      }
	    }
	    else if(w1groupA < w1groupB){              
	      if(w2groupC == w2groupD){               
	        if(ball[8] == ball[2]){               
	        	ballLoc = 3;
	          weight = "Lighter";
	        }
	        else{                                   
	          ballLoc = 2;
	          weight = "Lighter";
	        }
	      }
	      else if(w2groupC < w2groupD){              
	        if(ball[6] == ball[7]){               
	          ballLoc = 0;
	          weight = "Lighter";
	        }
	        else if(ball[6] > ball[7]){              
	          ballLoc = 6;
	          weight = "Heavier";
	        }
	        else{                                   
	          ballLoc = 7;
	          weight = "Heavier";
	        }
	      }
	      else{                                   
	        if(ball[4] == ball[5]){               
	          ballLoc = 1;
	          weight = "Lighter";
	        }
	        else if(ball[4] > ball[5]){              
	          ballLoc = 4;
	          weight = "Heavier";
	        }
	        else{                                  
	          ballLoc = 5;
	          weight = "Heavier";
	        }
	      }
	    }
	    else{                                   
	      if(w2groupE == w2groupF){               
	        if(ball[8] == ball[6]){               
	          ballLoc = 7;
	          weight = "Lighter";
	        }
	        else{                                   
	          ballLoc = 6;
	          weight = "Lighter";
	        }
	      }
	      else if(w2groupE < w2groupF){              
	        if(ball[2] == ball[3]){               
	          ballLoc = 4;
	          weight = "Lighter";
	        }
	        else if(ball[2] > ball[3]){              
	          ballLoc = 2;
	          weight = "Heavier";
	        }
	        else{                                   
	          ballLoc = 3;
	          weight = "Heavier";
	        }
	      }
	      else{                                   
	        if(ball[0] == ball[1]){               
	          ballLoc = 5;
	          weight = "Lighter";
	        }
	        else if(ball[0] > ball[1]){              
	          ballLoc = 0;
	          weight = "Heavier";
	        }
	        else{                                   
	          ballLoc = 1;
	          weight = "Heavier";
	        }
	      }
	    }
	    
	    for (int y =0; y<= (groups-1); y++) {
			   System.out.println("Group" + (y+1));
		    	 
		    	  if(y > 0 && y <2) {
		    		  for(int n = 0; n < 4; n++){
					      System.out.print (" ball " + (n+5) + " - " + ball[n+4]);
					      
					    }
		    	  } else if (y >0 && y <3){
		    		  for(int n = 0; n < 4; n++){
					      System.out.print (" ball " + (n+9) + " - " + ball[n+8]);
					
					    }
		    	  } else {
		    		  for(int n = 0; n < 4; n++){
					      System.out.print (" ball " + (n+1) + " - " + ball[n]);
					     
		    		  }
		    	  }
		    	  System.out.println("");
		    }
		  
		   System.out.println("");
	    
	    
	    if(regularBall > defectiveBall){
	    	System.out.println("");
		     System.out.println("The defective ball is ball " + (defectiveBall+1) + " and is Lighter");
		    }
		    else{
		    System.out.println("");
		     System.out.println("The defective ball is ball " + (defectiveBall+1) + " and is Heavier");
		    }	    
	    
	  }
	  


	  public static int randInt(int min, int max) {
	    
	    Random rand = new Random();

	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    
	    return randomNum;
	  }

		
	}



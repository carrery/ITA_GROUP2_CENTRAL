package com.oocl.bangipr.sw3;


class DeadlyException extends Exception {

}

class KillerException extends Exception {

}

class PoisonException extends Exception {

	
}
public class Main {
	

	       

	       public static void main(String[] args) {
	              // TODO Auto-generated method stub
	              try {
	            	  throw new DeadlyException();
	            
	              } catch (Exception e) {
	                     e.printStackTrace();
	              }
	       }

	}




package com.oocl.bituiga.sw3;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		try {
			throw new MyOnlyException();			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				throw new TheOtherException();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					throw new YouAreTheException();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();				}
			}
		}
		
	}

}

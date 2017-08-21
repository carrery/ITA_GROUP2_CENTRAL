package com.oocl.bituiga.sw1;

import net.webservicex.Currency;
import net.webservicex.CurrencyConvertor;
import net.webservicex.CurrencyConvertorSoap;

public class Currensee {

	
	public Currensee() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		if(args.length != 1) 
		{
			System.out.println("No Args");
		}
		else {
			
			CurrencyConvertor con = new CurrencyConvertor();
			CurrencyConvertorSoap conSoap = con.getCurrencyConvertorSoap();
			
			double conn = conSoap.conversionRate(Currency.USD, Currency.SGD);
			double usdd = 5;
			double sgdd = usdd * conn;
			
			System.out.println(sgdd);
			
		}
	}
	
}

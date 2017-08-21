package com.oocl.bangipr.sw1;

import net.webservicex.currency.*;


public class ConvertCurrency {

	public static void main(String[] args) {
			
		
		CurrencyConvertor convertor = new CurrencyConvertor();
		CurrencyConvertorSoap curSoap = convertor.getCurrencyConvertorSoap();
		Currency fromCur = Currency.USD;
		Currency toCur = Currency.PHP;
		System.out.println(curSoap.conversionRate(fromCur, toCur));
		
		
	}

}

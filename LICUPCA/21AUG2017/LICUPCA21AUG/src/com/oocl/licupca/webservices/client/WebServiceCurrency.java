package com.oocl.licupca.webservices.client;


import net.webservicex.Currency;
import net.webservicex.CurrencyConvertor;
import net.webservicex.CurrencyConvertorSoap;

public class WebServiceCurrency {

	public WebServiceCurrency() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {

		CurrencyConvertor currencyConvertor = new CurrencyConvertor();
		CurrencyConvertorSoap currencyConvertorSoap = currencyConvertor.getCurrencyConvertorSoap();
		double currency = currencyConvertorSoap.conversionRate(Currency.USD, Currency.PHP);

		System.out.println(currency);

	}

}

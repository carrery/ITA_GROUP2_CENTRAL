package com.oocl.licupca.webservices.client;

import net.webservicex.GeoIP;
import net.webservicex.Translate;
import net.webservicex.TranslateService;
import net.webservicex.TranslateServiceSoap;

public class WebServiceTranslator {

	public WebServiceTranslator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		TranslateService translateService = new TranslateService();
		TranslateServiceSoap translateServiceSoap = translateService.getTranslateServiceSoap();
		String translate = translateServiceSoap.translate("EnglishTOChinese", "rice");

		System.out.println(translate);

	}
}

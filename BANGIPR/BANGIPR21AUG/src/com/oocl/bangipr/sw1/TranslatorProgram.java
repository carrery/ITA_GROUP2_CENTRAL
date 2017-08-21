package com.oocl.bangipr.sw1;

import net.webservicx.translate.*;

public class TranslatorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String lang = "moon";
			
			TranslateService translateWord = new TranslateService();
			TranslateServiceSoap trans = translateWord.getTranslateServiceSoap();
			String translate =  trans.translate("EnglishTOFrench", lang ); 
			System.out.println(translate);
			
			
			
			
		

	}

}

package com.oocl.bituiga.sw1;

import net.webservicex.TranslateService;
import net.webservicex.TranslateServiceSoap;

public class Transleyt {

	
	public Transleyt() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		if(args.length <= 0) 
		{
			System.out.println("No Args");
		}
		else {
			TranslateService newSerrv = new TranslateService();
			TranslateServiceSoap ipServv = newSerrv.getTranslateServiceSoap();
			String translator = ipServv.translate("EnglishTOPortuguese",args[0]);
			
			System.out.println(translator);
			
		}
	}
	
}

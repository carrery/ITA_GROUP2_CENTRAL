package com.oocl.bangipr.sw1;

import com.oocl.licupca.misc.ws.main.CalcuMain;
import com.oocl.licupca.misc.ws.main.CalcuMainService;


public class NewCalculator {
	
		CalcuMainService calc = new CalcuMainService();
		CalcuMain calcMain = calc.getCalcuMainPort();
		
		
		public double getCalc(double x, String a, double y) {
			
			return calcMain.calculate(x, a, y);
			
		}

	
		

}

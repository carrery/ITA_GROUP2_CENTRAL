package com.oocl.burgoka.webservicesw1;

import java.util.ArrayList;
import java.util.List;

public class CalculatorImpl {
	private String cat;

	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}

	List<Integer> addList = new ArrayList<>();
	List<Integer> subList = new ArrayList<>();
	List<Integer> mulList = new ArrayList<>();
	List<Integer> divList = new ArrayList<>();
	
	int sum = 0;
	int subt = 1;
	int pro = 0;
	int divi = 1;
	
	public CalculatorImpl() {
		// TODO Auto-generated constructor stub
		addList.add(5);
		addList.add(6);
		addList.add(7);
		
		subList.add(20);
		subList.add(9);
		subList.add(5);
		
		mulList.add(2);
		mulList.add(7);
		mulList.add(7);
		
		divList.add(4);
		divList.add(2);
		
	}
		public String getOutputCategories(String input) {

		List<String> categories = new ArrayList<>();
		categories.add("Add");
		categories.add("Minus");
		categories.add("Multiply");
		categories.add("Divide");
		
		for (String line : categories) {
			if(input.equals(line.toLowerCase())) {
				return line.toLowerCase();
			}
		}
		
		return null;
		
	}
	
	public int getProducts (String category){
		switch (category) {
		case "add":
			for (Integer in : addList) {
				sum+=in;
			}
			return sum;
		case "minus":
			for (Integer in : subList) {
				subt-=in;
			}
			return subt;
		case "multiply":
			for (Integer in : mulList) {
				pro*=in;
			}
			return pro;
		case "divide":
			for (Integer in : mulList) {
				divi/=in;
			}
			return divi;
		}
		return 0;
	}

}

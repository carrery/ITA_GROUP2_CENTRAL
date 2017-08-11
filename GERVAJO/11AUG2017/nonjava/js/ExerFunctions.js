function exer10(){
 var input = document.getElementById("x").value;
	var fact = 1;
	var z = 1;
	if (input < 0){
		return "Must be positive number!";
	} else if (input == 0){
		return 1;
	} else {
		for(var x=0;x<input;x++) {
		fact*=z;
		z++;
	}
    return fact;
	}
}

function leap(){
	var year = document.getElementById("year").value;
	if(year < 1){
		return "Invalid year!";
	} else {
		if(year%4 == 0){
			return "Leap year";
		} else{
			return "Not Leap year";
		}
	}
}

function reverse(){
	var input  = document.getElementById("reverse").value;
	var length = input.length;
	var output = "";
	while (length > 0){
		output += input.substring(length-1,length);
		length--
	}
	return output;

}

function checkDigit(){
	var check = document.getElementById("checkdigit").value;
	if(!isNaN(check)){
		return "true";
	} else {
		return "false";
	}

}

function getArea(){
	var side1 = parseFloat(document.getElementById("side1").value);
	var side2 = parseFloat(document.getElementById("side2").value);
	var side3 = parseFloat(document.getElementById("side3").value);

	var area = (side1 + side2 + side3) / 2;
	return area;

}

function getDate(){
	var today = new Date();
	var todayString;
	var todayTime;
	var day = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"];
	todayString = day[today.getDay()];
	if(today.getHours() > 12){
		todayTime = (today.getHours() - 12) + "PM";
	} else {
		todayTime = today.getHours() + "AM"
	}
	return "Today is " + todayString + "\nCurrent Time: " + todayTime + " " + today.getMinutes() + ":" + today.getSeconds();
}

function displayStrings(){
	var output = "";
	var input = document.getElementById("input").value;
	for(var i = 0; i<=input.length; i++){
		for(var j = 0; j<i ; j++){
			output += input.substring(j,i) + ",";
		}
	}
	return output;
}

function getPrimeNumbers(){
	var input  = document.getElementById("prime").value;
	var output = "";
	var flag;
	for(var j=0 ; j<=input; j++){
		for (var i = 2; i < j; i++) {
	        if (j % i == 0 && i != j) 
	        	flag = false;
	    }
	    if(flag){
	    	if (j > 1){
	    		output += j + " ";	
	    	}
	   	}
	   	flag =  true;
	}

	return output;
}

function camelized(){
	var input  = document.getElementById("camel").value;
	var output = input.split(" ");
	var result = "";
	for(var i=0; i<output.length; i++){
		result += output[i].substring(0,1).toUpperCase() + output[i].substring(1,input.length);
	}

	return result;
}

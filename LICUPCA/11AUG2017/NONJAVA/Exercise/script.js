function factorial(num){
	if (num === 0)
	{
		return 1;
	}
	else if (num<0)
	{
		return 'Invalid. Only positive';
	}
	else
	{
		return num * factorial( num - 1 );
	}
}

function leapYear(year){
	if (year%4==0 && year>0)
		window.alert(year + ' is a leap year');
	else 
		window.alert(year + ' is not a leap year');
}

function allStringPossible(string){
	var result = "";
	for (var i = 0; i <= string.length; i++)
		for (var j = 0; j < i; j++)
			result +=  string.substring(j,i) + ".";
	window.alert(result);
}

function is_Numeric(variable){
	window.alert(variable >= 0 || variable <= 0)
}

function reverseString(string){
	var result = "";
	for (var i = string.length - 1; i >= 0; i --){
		result += string.substring(i, i+1);
	}
	window.alert(result);
}

function triangleArea(){
	window.alert( (5+6+7) / 2);
}

function primeFactors(int)
{
    var intArray  = [], i, j, primes = [];
    for (i = 2; i <= int; ++i) 
    {
        if (!intArray [i]) 
          {
            primes.push(i);
            for (j = i << 1; j <= int; j += i) 
            {
                intArray[j] = true;
            }
        }
    }
    window.alert(primes);
}

function getCurrentDay(){
	var now = new Date();
	var days = ['Sunday','Monday','Tuesday','Wednesday','Thursday','Friday','Saturday'];
	var meridiem = now.getHours() > 12 ? " PM" : " AM";
	var hours = (now.getHours() > 12 ? now.getHours() - 12 : now.getHours() == 0 ? 12 : now.getHours());
	var day = days[ now.getDay() ];

	window.alert("Today is: " + day + "\nCurrent time: " + hours + meridiem + " : " + now.getMinutes() +" : "+ now.getSeconds());
}

function camelize(string){
	var stringArray = string.split(" ");
	var result = "";
	for (var i = 0; i < stringArray.length; i++){
		result += stringArray[i].substring(0,1).toUpperCase() + stringArray[i].substring(1,stringArray[i].length);
	}
	window.alert(result);
}

function getStrings (){
	var inputStr = "dog";
	var strOutput = [];
	var str2 = "";


	for (var i = 0; i <= inputStr.length; i++) {
		for (var j = 0; j < i; j++) {
			strOutput.push(inputStr.substr(j,i));
		}
	}

	alert(strOutput);

} 
var attempt = 3; 

var admin=["1001", "admin", "admin123", "2300"];
var user1 = ["1002","user1", "user123", "300"];
var user2 = ["1003","user2", "user1234", "230"];
var balance;

window.onload = function()
{
	 var num = document.getElementById('acctNum');
	 var name = document.getElementById('acctName');
	 var bal = document.getElementById('acctBal');
     num.innerHTML=localStorage.getItem('num');
     name.innerHTML = localStorage.getItem('user');
     bal.innerHTML =localStorage.getItem('bal');

}


function logout(){
	var log= confirm("Do you really want to logout?");
    if (log== true){
    	localStorage.clear();
    	document.location.href = '/ATM/ATMServlet'
    }
}
function home(){
	document.location.href = '/ATM/ATMBalServlet';
}

function validate(){
	var username = document.getElementById("username").value;
	var password = document.getElementById("password").value;

	
	if(username == admin[1] && password == admin[2]){
		localStorage.setItem('num', admin[0]);
		localStorage.setItem('user', admin[1]);
		localStorage.setItem('pass', admin[2]);
		localStorage.setItem('bal', admin[3]);
		//document.location.href = '/ATM/ATMBalServlet';
		home();
		
	} else if (username == user1[1] && password == user1[2]) {
		localStorage.setItem('num', user1[0]);
		localStorage.setItem('user', user1[1]);
		localStorage.setItem('pass', user1[2]);
		localStorage.setItem('bal', user1[3]);
		//document.location.href = '/ATM/ATMBalServlet';
		home();
	} else if (username == user2[0] && password == user2[1]){
		localStorage.setItem('num', user2[0]);
		localStorage.setItem('user', user2[1]);
		localStorage.setItem('pass', user2[2]);
		localStorage.setItem('bal', user2[3]);
		//document.location.href = '/ATM/ATMBalServlet';
		home();
	} else{
		attempt --;
		alert("You have left "+attempt+" attempt;");
		

		if( attempt == 0){
			document.getElementById("username").disabled = true;
			document.getElementById("password").disabled = true;
			document.getElementById("submit").disabled = true;
			return false;
		}
	}
}

function withdraw(){
	var bals = localStorage.getItem('bal');
	var amt = parseInt(document.getElementById("withdrawAmt").value);
	if(amt > bals){
		alert("YOU CANNOT DO THAT! You are trying to withdraw money more that your balance. Please try again");
	} else{
		var fin = bals - amt;
		//balance = fin;
		localStorage.clear('bal');
		localStorage.setItem('bal', fin);
		
		console.log(localStorage.getItem('bal'));
		alert("Withdraw Successful! You balance is " + fin);
		
		document.location.href = '/ATM/ATMBalServlet';
	}
	
	
}


function checkBalance(){
	
	
	var bals = localStorage.getItem('bal');
	alert("Hello " + bals);
	document.location.href = '/ATM/ATMBalServlet';
}

function deposit(){
	var bals = localStorage.getItem('bal');
	
	var amt = parseInt(document.getElementById("depositAmt").value);
	var fin = parseInt(bals) + parseInt(amt);
	localStorage.clear('bal');
	localStorage.setItem('bal', fin);
	console.log(localStorage.getItem('bal'));
	alert("Deposit Successful! You balance is " + fin);
	
	document.location.href = '/ATM/ATMBalServlet';
}
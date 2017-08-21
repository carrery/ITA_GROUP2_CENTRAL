var img = null;

function exer1(){
	var rows = document.getElementById("row").value;
	var cols = document.getElementById("col").value;

  	var tbl = document.getElementById('table1');
  	for(var i=0;i<rows;i++){
    	row = tbl.insertRow(tbl.rows.length);
    	for(var j=0;j<cols;j++){
    		col = row.insertCell();
    		col.innerHTML = "Test";
    	}  	
	}
}

function init(){
	img = document.getElementById('payslip');
	img.style.position= 'relative'; 
	img.style.left = '0px';
	img.style.up = '0px'; 
}

function moveR(){
	img.style.left = parseInt(img.style.left) + 100 + 'px';
}

function moveD(){
	img.style.up = parseInt(img.style.up) + 100 + 'px';
}
function returnImg(){
	img.style.left = 0 + 'px';
}

 window.onload = init;

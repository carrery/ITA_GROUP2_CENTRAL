// no.1
var black=document.getElementById('black');
var ctx=black.getContext('2d');
ctx.fillStyle='#000000';
ctx.fillRect(0,0,50,50);

var white=document.getElementById('black');
var ctx=white.getContext('2d');
ctx.fillStyle='#FFFFFF';
ctx.fillRect(10,10,30,30);

var white2=document.getElementById('black');
var ctx=white2.getContext('2d');
ctx.strokeStyle = "black";
ctx.lineWidth = "2";
ctx.strokeRect(13, 13, 24, 24);


//no.2
var red=document.getElementById('red');
var ctx=red.getContext('2d');
ctx.fillStyle='red';
ctx.fillRect(0,0,20,20);

var blue=document.getElementById('red');
var ctx=blue.getContext('2d');
ctx.fillStyle='rgba(50, 0, 255, 0.5)';
ctx.fillRect(10,10,20,20);

//no3
var smiley=document.getElementById('smiley');
var ctx = smiley.getContext("2d");
var centerX = smiley.width / 2;
var centerY = smiley.height / 2;

//head
ctx.beginPath();
ctx.arc(50, 50, 50, 0, 2 * Math.PI, false);
ctx.fillStyle = "white";
ctx.fill();
ctx.lineWidth = 1;
ctx.strokeStyle = "black";
ctx.stroke();

//eyes


ctx.beginPath();
ctx.arc(35, 40, 5, 0, 2 * Math.PI, false);
ctx.fillStyle = "white";
ctx.fill();
ctx.lineWidth = 1;
ctx.strokeStyle = "black";
ctx.stroke();


ctx.beginPath();
ctx.arc(65, 40, 5, 0, 2 * Math.PI, false);
ctx.fillStyle = "white";
ctx.fill();
ctx.lineWidth = 1;
ctx.strokeStyle = "black";
ctx.stroke();

ctx.beginPath();
ctx.moveTo(30,40);
ctx.lineTo(70,40);
ctx.stroke();


//smile
ctx.beginPath();
ctx.arc(50, 60, 30, 0 * Math.PI , 1 * Math.PI, false);
ctx.fillStyle = "white";
ctx.fill();
ctx.lineWidth = 1;
ctx.strokeStyle = "black";
ctx.stroke();



//no.4
var circles = document.getElementById("circle");
var ctx = circles.getContext("2d");
var centerX = circles.width / 2;
var centerY = circles.height / 2;
var radius = 5;


for (var i=0; i <6 ; i++){
	var position = 10;
	var color = "rgba(0, 0, 0, " + i/6 +  ")"
	ctx.beginPath();
	ctx.translate(position, position);
	ctx.arc(position, position, radius, 0, 2 * Math.PI, false);
	ctx.fillStyle = color;
	ctx.fill();
	ctx.lineWidth = 1;
	ctx.strokeStyle = "black"
	ctx.stroke();

	position += 15;
}





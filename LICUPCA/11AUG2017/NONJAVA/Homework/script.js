	var canvas1 = document.getElementById("canvas1");
	var square1 = canvas1.getContext("2d");
	var canvas2= document.getElementById("canvas2");
	var square2 = canvas2.getContext("2d");
	var canvas3 = document.getElementById("canvas3");
	var smiley = canvas3.getContext("2d");
	var canvas4 = document.getElementById("canvas4");
	var circles = canvas4.getContext("2d");

	drawSquare();
	drawOverlapRect();
	drawHappyFace();
	drawCirclesGradient();

	function drawSquare(){
		square1.beginPath();
		square1.lineWidth = "20";
		square1.strokeStyle = "black";
		square1.rect(5, 5, 100, 100);  
		square1.stroke();
		square1.beginPath();
		square1.lineWidth = "2";
		square1.strokeStyle = "black";
		square1.rect(25, 25, 60, 60);
		square1.stroke();
	}

	function drawOverlapRect(){
		square2.beginPath();
		square2.fillStyle = "rgba(255, 0, 0, 1)";
		square2.fillRect(0,0,70,70);
		square2.stroke();
		square2.beginPath();
		square2.fillStyle = "rgba(0, 0, 255, .5)";
		square2.fillRect(35,35,70,70);
		square2.stroke();
	}

	

	function drawFace() {
		var x = canvas3.width / 2;
		var y = canvas3.height / 2;
		var radius = canvas3.width / 2;
		var startAngle = 0;
		var endAngle = 2 * Math.PI;
		smiley.beginPath();
		smiley.arc(x, y, radius, startAngle, endAngle);
		smiley.stroke();
	}

	function drawSmile(){
		var x = canvas3.width/2;
		var y = canvas3.height/2
		var radius = canvas3.height/3;
		var startAngle = 0.0 * Math.PI;
		var endAngle = 1.0 * Math.PI;

		smiley.beginPath();
		smiley.arc(x, y, radius, startAngle, endAngle);
		smiley.lineWidth = 2;
		smiley.strokeStyle = 'black';
		smiley.stroke();
	}

	function drawEyes(){
		var centerX = 0;
		var centerY = 0;
		var radius = 10;

		smiley.save();
		smiley.translate(canvas3.width / 3, canvas3.height / 3);
		smiley.scale(1, 1);
		smiley.beginPath();
		smiley.arc(centerX, centerY, radius, 0, 2 * Math.PI, false);

		smiley.restore();
		smiley.lineWidth = 2;
		smiley.strokeStyle = 'black';
		smiley.stroke();

		smiley.save();
		smiley.translate((canvas3.width / 3)*2, canvas3.height / 3);
		smiley.scale(1, 1);
		smiley.beginPath();
		smiley.arc(centerX, centerY, radius, 0, 2 * Math.PI, false);

		smiley.restore();
		smiley.lineWidth = 2;
		smiley.strokeStyle = 'black';
		smiley.stroke();

		smiley.save();
		smiley.beginPath();
		smiley.translate(0, canvas3.height / 3);
		smiley.moveTo(40, 0);
		smiley.lineTo(110, 0);
		smiley.restore();


		smiley.stroke();
	}
	
	function drawHappyFace(){
		drawFace();
		drawEyes();
		drawSmile();
	}

	function drawCirclesGradient(){
		var centerX = 20;
		var centerY = 20;
		var radius = 10;
		for (var i = 0; i < 6; i++){
			var opacity = i/6;
			var colorString = "rgba(0, 0, 0, "+opacity+")";
			circles.save();
			circles.translate(centerX + (i*centerX), centerY + (i*centerY));
			circles.scale(1, 1);
			circles.beginPath();
			circles.arc(centerX, centerY, radius, 0, 2 * Math.PI, false);
			circles.lineWidth = 1;
			circles.strokeStyle = 'black';
			circles.fillStyle = colorString;
			circles.fill();
			circles.restore();
			circles.stroke();
		}
		
	}


function draw () {
var canvas = document.getElementById('canvas');
var num = document.getElementById('num').value;
if (canvas.getContext) {
var ctx = canvas.getContext('2d'),
X = 0,
Y = 0,
R = 20,
colors = ['#FFFFFF', '#E0E0E0', '#D0D0D0', '#B8B8B8', '#989898','#808080','#696969', '#606060', '#484848'  ,'#000000' ];

for (var i = 0; i < num; i++) {
ctx.beginPath();
ctx.arc(X = X+40,Y = Y+40,R,0,Math.PI*2);
ctx.fillStyle = colors[i];
ctx.fill();
ctx.stroke();
ctx.closePath();
}
}
}
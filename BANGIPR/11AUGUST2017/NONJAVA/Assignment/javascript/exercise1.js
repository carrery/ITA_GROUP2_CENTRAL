function create() {

  var canvas = document.getElementById('canvas');
  var height = document.getElementById('height').value;
  var width = document.getElementById('width').value;
  if (canvas.getContext) {

  	canvas.width = width;
  	canvas.height = height;

     var context = canvas.getContext('2d');
     context.fillRect(20,20,(width - 50), (height - 50));
    context.clearRect(40,40,(width - 90), (height -90));
    context.strokeRect(45,45,(width -100), (height - 100));
  }

console.log(canvas);
}


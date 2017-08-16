function create() 
  {
      var canvas = document.getElementById("canvas");
       var height = document.getElementById('height').value;
       var width = document.getElementById('width').value;
      if (canvas.getContext)
      {

          canvas.width = width;
          canvas.height = height;

        var context = canvas.getContext("2d");

        context.fillStyle = "rgb(256,0,0)";
        context.fillRect (15, 10, (width - 95), (height - 100));
        
        context.fillStyle = "rgba(0, 0, 200, 0.6)";
        context.fillRect (35, 30, (width - 95), (height - 100));
      }
  }
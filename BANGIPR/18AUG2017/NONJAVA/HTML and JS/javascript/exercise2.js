
var imgObj = null;

 function init(){
               imgObj = document.getElementById('myGif');
               imgObj.style.position= 'relative'; 
               imgObj.style.left = imgObj.offsetLeft + 'px'; 

}

function moveRight(){

imgObj = document.getElementById('myGif');
//imgObj.offsetLeft + 10; 
    imgObj.style.left = parseInt(imgObj.style.left) + 10 + 'px';
   // console.log(imgObj.style.left);
  }


function moveLeft(){

imgObj = document.getElementById('myGif');
//imgObj.offsetLeft + 10; 
    imgObj.style.left = parseInt(imgObj.style.left)  - 10 + 'px';
    //console.log(imgObj.style.left);
  }

function moveit(){

  imgObj = document.getElementById('myGif');
  divv = document.getElementById('divv');

  var fragment = create("<marquee behavior='scroll' direction='right'> <img id='myGif' src='images/himouto.gif' /></marquee>");
divv.insertBefore(fragment, divv.childNodes[0]);

}


function create(htmlStr) {
    var frag = document.createDocumentFragment(),
        temp = document.getElementById('divv');
    temp.innerHTML = htmlStr;
    while (temp.firstChild) {
        frag.appendChild(temp.firstChild);
    }
    return frag;
}


function stopp(){
  imgObj = document.getElementById('myGif');
  imgObj.stop();

}


    window.onload =init;
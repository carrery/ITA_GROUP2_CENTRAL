function create() {

  var rows = document.getElementById('rows').value;
  var columns = document.getElementById('columns').value;
  
  for(var r=0;r<parseInt(rows,10);r++)
  {
   var x=document.getElementById('createdTable').insertRow(r);
   for(var c=0;c<parseInt(columns,10);c++)  
    {
     var y=  x.insertCell(c);
     y.innerHTML="   This is row "+r+" and this is Column "+c + "   "; 
    }
   }
}


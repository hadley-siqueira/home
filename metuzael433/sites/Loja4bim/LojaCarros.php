<!DOCTYPE html>
<html>
    <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<style>

   html, body  {
    margin:0px;
    padding:0px;
    background-image: url("https://fm.cnbc.com/applications/cnbc.com/resources/img/editorial/2014/01/30/101377682-185720769.1910x1000.jpg");
    background-color: #cccccc;
    background-image: no-repeat;
    background-position: relative;
    background-size:cover;
    background-position: center;
    text-align: center;
    top: 70px;
}

div [id=Buscar] {
    position: relative;
    background-position: center;
    top: -160px;    
}
 
div {  
    background-color: rgba(255, 255, 255, 0.7);
    width: 50%; 
    position: relative;
    left: 350px;
    top: 70px;
    box-sizing: border-box;
    border-radius: 8px;
    padding: 200px;
}  
 
input[type=text] {
    width: 250px;
    position: relative;
    top: -1px;
    box-sizing: border-box;
    border: 2px solid #ccc;
    border-radius: 8px;
    font-size: 16px;
    background-color: white;
    background-image: url('searchicon.png');
    background-position: 10px 10px; 
    background-repeat: no-repeat;
    padding: 1px 20px 15px 15px;
    -webkit- transition: width 0.4s ease-in-out;
    transition: width 0.4s ease-in-out;
}
input[type=text]:focus {
    width: 100%;
}

form {
    text-align: center;

}

</style>
</head>
    <body>
     
    <script>

    function showHint(str) {
    if (str.length == "") {
        document.getElementById("fname2").innerHTML = "";
        return;
      } else {
        var xmlhttp = new XMLHttpRequest();
        xmlhttp.onreadystatechange = function() {
            if (this.readyState == 4 && this.status == 200) {
                document.getElementById("fname2").innerHTML = this.responseText;
            }
        }
        xmlhttp.open("GET", "TabelaDeCarros.php?q="+str, true);
        xmlhttp.send();
    }
}

    
</script>
       <div id="backcolor">
       <form> <b id="Buscar">   Buscar Produtos</br> <input type="text" id="fname" onkeyup="showHint(this.value)">
       <p id="fname2"></p>
        </div>
</form> 

</body>
</html>


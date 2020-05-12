<!DOCTYPE>
<html>
    <head>
    <meta charset="utf-8">
<style>
body  {
    background-image: url("https://2.bp.blogspot.com/-gOiBTP4XQXk/WDb5_0yd5WI/AAAAAAAAVFk/OEikM2mJkJgI1jg1soIFLl-UwvDTELXsQCLcB/s1600/md2016_10_07-082017.jpg");
    background-color: #cccccc;
    position: relative;
    top: 70px;
}

div [id=Buscar] {
    position: relative;
    top: -160px;    
}
 
div {  
    background-color: rgba(255, 255, 255, 0.7);
    width: 50%; 
    position: relative;
    left: 350px;
    top: 40px;
    box-sizing: border-box;
    border-radius: 8px;
    padding: 200px;
}  
 
input[type=text] {
    width: 200px;
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
        xmlhttp.open("GET", "TabelaLoja.php?q="+str, true);
        xmlhttp.send();
    }
}

    
</script>
       <div id="backcolor">
       <form> <b id="Buscar">   Buscar</br> <input type="text" id="fname" onkeyup="showHint(this.value)">
       <p id="fname2"></p>
        </div>
</form> 

</body>
</html>

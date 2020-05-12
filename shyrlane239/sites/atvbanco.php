<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
  
        <style>
             #qdr{
                background-color: #E0E0E0;
                text-align:center;
                width: 50%;
                padding-left: 40px;
                padding-right: 40px;
                padding-bottom: 40px;
                margin: 100px; 
                margin-left: 270px;
                border: 2px solid #E0E0E0;
                border-radius: 20px;
            } 

            #titulo{
                font-family: "Lucida Console", serif;
                text-align: center;
                font-weight: bold;
                color: #000000;
            }
                                                               
            input[type=text], select {
                width: 50%;
                background-color: #F5F5F5;
                border: 1px solid #000000;
                border-radius: 8px;
                display: inline-block;
                padding: 12px 20px;
                margin 10px 0;
                box-sizing: border-box;
                background-image: url('searchicon.png');
                background-position: 10px 10px;
                background-repeat: no-repeat;
                -webkit-transition: width 0.4s ease-in-out;
                transition: width 0.4s ease-in-out;
            }    
  
        </style>
    </head>
    <script>
    function showUser(str) {
    if (str == "") {
        document.getElementById("txtHint").innerHTML = "";
        return;
    } else { 
        if (window.XMLHttpRequest) {
            // code for IE7+, Firefox, Chrome, Opera, Safari
            xmlhttp = new XMLHttpRequest();
        } else {
            // code for IE6, IE5
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
        xmlhttp.onreadystatechange = function() {
            if (this.readyState == 4 && this.status == 200) {
                document.getElementById("txtHint").innerHTML = this.responseText;
            }
        };
        xmlhttp.open("GET","gostosura2.php?q="+str,true);
        xmlhttp.send();
    }
}
    </script>
    <body background="https://4.bp.blogspot.com/-_NFZyy7EvNM/UYwj83krLyI/AAAAAAAAEHI/Xlna34fGf-Q/s1600/SEARS-loja-miami-orlando.jpg">
    
    <div id="qdr">
        <div id="titulo">
            <h1 style="font-size:35px">Busca de Produtos</h1>
        </div>
         
        <input type="text" name="pesquisar" placeholder="Pesquisar" onkeyup="showUser(this.value)" />       
        <div id="txtHint"><b></b> 
    </div>
    </body>
</html>

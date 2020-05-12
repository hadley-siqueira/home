<!DOCTYPEhtml>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        body {
        background-image: url("https://www.galeriadaarquitetura.com.br/Img/aec/tematico/img_figuras/supermercado-koing-projeto-de-interiores-meio$$12693.jpg");
        background-color: #cccccc;
        background-size: cover;
    }

    input[type=text] {
    width: 145px;
    box-sizing: border-box;
    border: 2px solid #ccc;
    border-radius: 4px;
    font-size: 16px;
    background-color: white;
    background-image: url();
    background-position: 10px 10px;
    background-repeat: no-repeat;
    padding: 12px 20px 12px 40px;
    -webkit-transition: width 0.4s ease-in-out;
 transition: width 0.4s ease-in-out;
    }

    input[type=text]:focus {
         width: 80%;
    }

    #main {
    margin: auto;
    margin-top: 100px;
    width: 600px;
    height: 500px;
    border: 1px solid black;
    display: -webkit-flex; /* Safari */
    display: flex;
    text-align: center;
}

    #main div {
    -webkit-flex: 1;  /* Safari 6.1+ */
    -ms-flex: 1;  /* IE 10 */
    flex: 1;
}

    </style>
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
        xmlhttp.open("GET","Loja2.php?q="+str,true);
 xmlhttp.send();
    }
}
</script>
</head>
<body>
    <div id="main">
    <div style="background-color:rgba(255,255,255,0.6);">
    <h1>Faça sua pesquisa:</h1>
            <form>
               <input type="text" name="pesquisar" placeholder="Digite aqui..." onkeyup="showUser(this.value)">
            </form>
            <br>
     <div id="txtHint"><b></b>
    </div>
    </body>
</html>



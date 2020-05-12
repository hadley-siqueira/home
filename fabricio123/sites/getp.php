  <!DOCTYPE html>
<html>
<head>
    <link href="https://www.homegrown.com.br/media/wysiwyg/loja-rio-sul.jpg" rel="stylesheet">
<style>

body  {
    background-image: url("https://www.homegrown.com.br/media/wysiwyg/loja-rio-sul.jpg");
    background-color: #cccccc;
}

table {
    width: 100%;
    border-collapse: collapse;
    color: #00001a;
    font-size: 20px;
}

table, td, th {
    border: 1px solid white;
    padding: 5px;
}

th {text-align: left;}
.d1 {
    margin: auto;
    width: 50%;
    border: 10px solid pink;
    padding: 10px;
    text-align: center;
}
</style>

<script>
function showUser(str) {
  if (str=="") {
    document.getElementById("txtHint").innerHTML="";
    return;
  }
  if (window.XMLHttpRequest) {
    // code for IE7+, Firefox, Chrome, Opera, Safari
    xmlhttp=new XMLHttpRequest();
  } else { // code for IE6, IE5
    xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
  xmlhttp.onreadystatechange=function() {
    if (this.readyState==4 && this.status==200) {
      document.getElementById("txtHint").innerHTML=this.responseText;
    }
  }
  xmlhttp.open("GET","sitep.php?q="+str,true);
  xmlhttp.send();
}
</script>
</head>
<body>
<div class="d1">
<h1> Busca de Produtos </h1>
<form>
<input name="users" onkeyup="showUser(this.value)">
</form>
<br>
<div id="txtHint"><b>Person info will be listed here.</b></div>
</div>
</body>
</html>

<html>
<head>
    <link href="http://artesanato.culturamix.com/blog/wp-content/gallery/fazer-porta-bijuterias/111.jpg" rel="stylesheet">
<style>

body {
    background-image: url("http://artesanato.culturamix.com/blog/wp-content/gallery/fazer-porta-bijuterias/111.jpg");
    background-color: #cccccc;
    text-align: center;
}
table {
    width:80%;
    text-align:center ;
    border-collapse: collapse;
    color: #1C1C1C;
    margin-top: 3px;
    background-color:#FFBBFF;
}
form{
        width: 30%;
        text-align: center;
        margin: auto;
        margin-top: 8rem;
        padding: 160px;
        background-color:rgba(20,25,70,0.5);
        border-radius: 10px 10px;
    }
#txtHint {
    display: flex;
    justify-content: center;
    text-align: center;
    margin: auto;
    padding: 5px;
}
table, td, th {
    border: 1px solid black;
    padding: 5px;
}
th {text-align: left;}

</style>
<script>
function showUser(str) {
    if (str == "") {
        document.getElementById("txtHint").innerHTML = "";
        return;
    } else { 
        if (window.XMLHttpRequest) {
           
            xmlhttp = new XMLHttpRequest();
        } else {
           
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
        xmlhttp.onreadystatechange = function() {
            if (this.readyState == 4 && this.status == 200) {
                document.getElementById("txtHint").innerHTML = this.responseText;
            }
        };
        xmlhttp.open("GET","teste2.php?q="+str,true);
        xmlhttp.send();
    }
}
</script>
</head>
<body>
<div>
<form>
<h1> Busca de Acessórios </h1>
<input name="users" onkeyup="showUser(this.value)">
<br>
<div id="txtHint"><b>Digite o nome do acessório</b></div>
</form>
</div>
</body>
</html>

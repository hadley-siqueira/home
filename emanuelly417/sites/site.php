<html>
<head>
    <link href="http://bpic.588ku.com/back_pic/03/70/07/2957b586d5da664.jpg" rel="stylesheet">
<style>

body {
    background-image: url("http://bpic.588ku.com/back_pic/03/70/07/2957b586d5da664.jpg");
    background-color: #cccccc;
    text-align: center;
}
table {
    width:100%;
    border-collapse: collapse;
    color: #8B0000;
    margin-top: 3px;
   
}
div{
    width:80%;
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
        xmlhttp.open("GET","getuser.php?q="+str,true);
        xmlhttp.send();
    }
}
</script>
</head>
<body>
<div>
<h1> Busca de produtos </h1>
<input name="users" onchange="showUser(this.value)">
<br>
<div id="txtHint"><b>Digite o nome do produto.</b></div>
</div>
</body>
</html>

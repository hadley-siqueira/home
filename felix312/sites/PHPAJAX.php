<!DOCTYPE>

<html>
<head>
<script>
function showHint(str) {
    if (str.length == 0) { 
        document.getElementById("txtCidade").innerHTML = "";
        return;
    } else {
        var xmlhttp = new XMLHttpRequest();
        xmlhttp.onreadystatechange = function() {
            if (this.readyState == 4 && this.status == 200) {
                document.getElementById("txtCidade").innerHTML = this.responseText;
            }
        }
        xmlhttp.open("GET", "Macau.php?q="+str, true);
        xmlhttp.send();
    }
}
function Nome(str) {
    if (Nome.length == 0) {
        document.getElementById("txtNome").innerHTML = "";
        return;
    } else {
        var xmlhttp = new XMLHttpRequest();
        xmlhttp.onreadystatechange = function() {
            if (this.readyState == 4 && this.status == 200) {
                document.getElementById("txtNome").innerHTML = this.responseText;
            }
        }
        xmlhttp.open("GET", "Nome.php?q="+str, true);
        xmlhttp.send();
    }
}
</script>
</head>
<body>

<p><b>Start typing a name in the input field below:</b></p>
<form> Cidade: <input type="text" onkeyup="showHint(this.value)">
</form>
<p>Suggestions: <span id="txtCidade"></span></p>
<form> Nome: <input type="text" onkeyup="Nome(this.value)">
</form>
<p>Suggestions: <span id="txtNome"></span></p>
</body>
</html>


<!DOCTYPE html>
<html>
    <head>
    <script>
        function showHint(str) {
                if (str.length == 0) { 
                document.getElementById("txtHint").innerHTML = "";
                return;
            } else {
                var xmlhttp = new XMLHttpRequest();
                xmlhttp.onreadystatechange = function() {
            if (this.readyState == 4 && this.status == 200) {
               document.getElementById("txtHint").innerHTML = this.responseText;
            }
            }
            xmlhttp.open("GET", "gethint.php?q="+str, true);
            xmlhttp.send();
            }
        }

        function showHint1(str1) {
                if (str1.length == 0) {
                document.getElementById("txtHint1").innerHTML = "";
                return;
            } else {
                var xmlhttp = new XMLHttpRequest();
                xmlhttp.onreadystatechange = function() {
            if (this.readyState == 4 && this.status == 200) {
               document.getElementById("txtHint1").innerHTML = this.responseText;
            }
            }
            xmlhttp.open("GET", "gethint1.php?q="+str1, true);
            xmlhttp.send();
            }
        }

    </script>
    </head>
    <body>

    <p><b>Comece digitando um nome e uma cidade no campo abaixo:</b></p>
        <form> 
            Primeiro nome: <input type="text" onkeyup="showHint(this.value)">
        </form>
    <p>Sugestões: <span id="txtHint"></span></p>
        <form>
            Cidade: <input type="text" onkeyup="showHint1(this.value)">
        </form>
    <p>Sugestões: <span id="txtHint1"></span></p>

    </body>
</html>

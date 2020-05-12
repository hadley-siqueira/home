<html>
    <head>
        <title>atividade sistema 4bim</title>
        <style>
            body{margin:0px; padding:0px; width:100%; height:100%; background:url("http://www.almmati.com/arquivos/images/produto-prod-2.jpg") no-repeat; background-size:100% 100%;}
            form{float:left; width:50%; height:50%; margin-left:25%; margin-top:150px; background-color:rgba(255,255,255,0.7); border-radius:5px;}
            input[type="text"]{float:left; width:20%; margin-left:40%; margin-top:30px; border-radius:3px; transition:all 0.5s; border:1px solid #999; padding:5px;}
            input[type="text"]:focus{width:80%; margin-left:10%; transition:all 0.5s; outline:none;}
            table{float:left; width:80%; margin-left:10%; margin-top:15px; border:1px solid gray; font-family:arial; font-size:14px;}
            tr{padding:0px; border:1px solid gray;}            
            td {padding:5px; margin:0px;}
            table thead {background-color:#b0b8c4;}
            table tbody {background-color:#f7faff;}
            table tfoot {background-color:#b0b8c4;}
        </style>
    </head>
    <body>
        <form>
            <input type="text"/>
            <table>
                <thead>
                    <tr>
                        <td>Nome: tal</td>
                        <td>Marca: tal</td>
                        <td>Quantidade: tal</td>
                        <td>Preço: tal</td>
                    </tr>
                    <tbody>
                        <tr>
                            <td colspan="4">Descrição: tal talt atla tal tals tatasl a st as lt </td>
                        </tr>
                    </tbody>
                    <tfoot>
                        <tr>
                            <td colspan="4">Observações: Emitir nota fiscal pelo sistema antigo!</td>
                        </tr>
                    <tfoot>
                </thead>
            </table>
        </form>
        
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
    </body>
</html>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
    </head>

    <body>
<style>

body {
background-image:url("http://escoladeimpressao3d.com.br/wp-content/uploads/2017/02/background.jpg");
}

input[type=text], select {
    width: 95%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    background-color: #ffffff;
    color: 008000;
}

input[type=submit] {
    width: 50$;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 10px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}

div {
    width: 45%;
    margin-left: auto;
    margin-right: auto;
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 10px;
    -webkit-box-shadow: 4px 6px 5px 3px rgba(0,0,0,0.75);
    -moz-box-shadow: 4px 6px 5px 3px rgba(0,0,0,0.75);
    box-shadow: 4px 6px 5px 3px rgba(0,0,0,0.75);
}

form {
  width: 50%;
  margin-left: auto;
  margin-right: auto;
}

h1 {
 width: 50%;
 margin-left: auto;
 margin-right: auto;
}

</style>
</body>
<head>  
  <div>
        <h1>Cadastro de Contato </h1>
        <form action="inserirContato2.php" method="post">
            <label>Nome</label> <br>
            <input type="text" name="nome"> <br> 
            
            <label>Telfone</label> <br>
            <input type="text" name="telefone"> <br> 
            
            <label>Email</label><br>
            <input type="text" name="email"><br>
            
            <input type="submit" value="Criar Contato">
            </form>
</div>
</head>
        </body>
</html>


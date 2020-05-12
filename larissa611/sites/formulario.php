<!DOCTYPE html>
<html>
         <head>
        <meta charset="utf-8">
        <<body background="http://escoladeimpressao3d.com.br/wp-content/uploads/2017/02/background.jpg">
    </head>
</html>

<!DOCTYPE html>
<html>
    <style>
            input[type=text], select {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: center;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }   

            input[type=submit] {
    width: 30%;
    text-align: center;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}

div {
    border-radius: 5px;
    
    background-color: white;
    padding: 15px;
}
</style>
    <body>
       <div>
       <h1>Cadastro de Contatos</h1>
       <form action="inserirContato.php" method="post">
        <label>Nome</label>
        <input type="text" name="nome">

        <label>Telefone</label>
        <input type="text" name="telefone">

        <label>Email</label>
        <input type="text" name="email">

        <input type="submit" value="Criar Contato">
       </form>
        </div>
    </body>
</html>

<!DOCTYPE html>
<html lang="en">

<head>
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,300i" rel="stylesheet">
    <link rel="stylesheet" href="css/estilos.css">
    <meta charset="UTF-8">
    <title></title>
</head>

<body>
    <style>
    
    body{
    background-image: url("https://www.unitins.br/cms/Midia/Imagens/LJXFDJNWNGG6J8AD14RKJMQIXLI7G802830PWOVEA.png");
    
}


    h1{
    font-family:Times New Roman;
    font-size:50px;
    color:green;
    font-style:italic;
    padding: 12px 20px;
    margin: 8px 0;
    box-sizing: border-box;
    border: 2px solid orange;
    border-radius: 4px;
    text-align: center;
    
}

</style>
    <h1>Cadastro de Contato</h1>
    <hr>
    <form action="inserirContato.php" method="post">
        <label>Nome</label>
        <input type="text" name="nome" placeholder="Ex.: Hadley Magno da Costa Siqueira">

        <label>Telefone</label>
        <input type="text" name="telefone" placeholder="Ex.:(84)99645-1709">

        <label>Email</label>
        <input type="text" name="email" placeholder="Ex.:zeca42@hotmail.com">

        <input type="submit" value="Criar Contato">
    </form>
</body>

</html>

<!DOCTYPE html>
<html lang="en">

<head>
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,300i" rel="stylesheet">
    <link rel="stylesheet" href="css/estilos.css">
    <meta charset="UTF-8">
    <title></title>
</head>

<body>
    <h1>Cadastro de Contato</h1>
    <hr>
    <form action="inserirContatos2php" method="post">
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


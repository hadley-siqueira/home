<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
    </head>

    <body>
        <h1>Cadastro de contatos</h1>
        <form action="inserirContatos.php" method="post">
        <label>Nome: </label>
        <input type="text" name="nome">

        <label>Telefone: </label>
        <input type="text" name="telefone">

        <label>Email: </label>
        <input type="text" name="email">

        <input type="submit" value="Criar contato">
        </form>
    </body>
</html>

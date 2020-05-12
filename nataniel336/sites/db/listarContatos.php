<?php
    $user = "nataniel336";
    $pass = "1234";
    $banco = "nataniel336_Agenda";
    $host = "localhost";
    $url = "mysql:host=$host;dbname=$banco";

    try {
        $conexao = new PDO($url, $user, $pass);

        $sql = "SELECT nome, telefone, email FROM Contatos";
        $comando = $conexao->prepare($sql);
        $comando->execute();
        $resultado = $comando->fetchAll();
        } catch (PDOException $e) {
        echo "Error: " . $e->getMessage();
        }
?>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <link href="https://fonts.googleapis.com/css?family=Roboto:300,300i" rel="stylesheet">
        <link rel="stylesheet" href="css/estilos.css">
    </head>

    <body>
     
        <h1 class="h12">Lista de Contatos</h1>
        <table>
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>Telefone</th>
                    <th>Email</th>
                </tr>
            </thead>

            <tbody>
                <?php foreach ($resultado as $k) { ?>
                <tr>
                    <td><?php echo $k['nome'] ?></td>
                    <td><?php echo $k['telefone'] ?></td>
                    <td><?php echo $k['email'] ?></td>
                </tr>
                <?php } ?>
             </tbody>
         </table>
        <a href="formulario.php">Adicionar Contato</a>
    </body>
</html>   

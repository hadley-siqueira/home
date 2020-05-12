<?php
    $user = "hadley";
    $pass = "1234";
    $banco = "hadley_agenda";
    $host = "localhost";
    $url = "mysql:host=$host;dbname=$banco";
    try{
        $conexao = new PDO($url, $user, $pass);
        $sql = "SELECT nom, telefone, email FROM Contatos";
        $comando = $conexao->prepare($sql);
        $comando->execute();
        $resultado = $comando->fetchAll();
    }catch(PDOExceptoin $e){
        echo "Error: " . $e->getMessage();;
    }
?>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
    </head>
    <body>
        <table>
            <thead>
                <tr>Nome</th>
                <tr>Telefone</th>
                <th>Email</th>
            <thead>
            <tbody>
                <?php
                    foreach ($resultado as $k){
                ?>
                <tr>
                    <td><?php echo $k['nome'] ?></td>
                    <td><?php echo $k['telefone'] ?></td>
                    <td><?php echo $k['email'] ?></td>
                </tr>
                <?php
                    }
                ?>
            </tbody>
        </table>
    </body>
</html>

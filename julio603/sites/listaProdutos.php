<?php
    $user="julio603";
    $pass="1234";
    $banco="julio603_Loja";
    $host="localhost";
    $url="mysql:host=$host;dbname=$banco";

    try{
     $conexao = new PDO($url, $user, $pass);

     $sql = "SELECT nome, preço, valor FROM Produtos";
     $comando = $conexao->prepare($sql);
     $comando->execute();
     $resultado = $comando->fetchAll();
    } catch (PDOException $e) {
        echo "Erro: " . $e->getMessage();
    }
?>

<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
    </head>

    <body>
        <table>
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>preço</th>
                    <th>valor</th>
                </tr>
            </thead>
        </table>

        <tbody>
            <?php foreach ($resultado as $k) { ?>
            <tr>
                <td><?php echo $k['nome']?> </td>
                <td><?php echo $k['preço']?> </td>
                <td><?php echo $k['valor']?> </td>

            </tr>
            <?php } ?>
        </tbody>
    </body>

</html>

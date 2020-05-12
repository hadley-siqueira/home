<?php
    $user ="francisco050";
    $pass ="1234";
    $banco ="francisco050_cadastro";
    $host = "localhost";
    $url ="mysql:host=$host;dbname=$banco";

    try{
        $conexao = new PDO ($url, $user, $pass);
        $sql = "SELECT nome, telefone, email, senha FROM cadastrados"; 
        $comando = $conexao->prepare($sql);
        $comando-> execute();
        $resultado =$comando->fetchAll();
        } catch (PDOException $e){
            echo "Error: " . $e->getMessage();
            } 
    
?>
<!DOCTYPE html>
<html>
    <head>
        <title> Pessoas cadastradas </title>
    </head>

    <body>
        <table>
            <thead>
                <th>Nome</th>
                <th>Telefone</th>
                <th>Email</th>
                <th>Senha</th>
            </thead>
            <tbody>
                <?php foreach ($resultado as $k) { ?>
                    <tr>
                        <td> <?php echo $k['nome']?> </td>
                        <td><?php echo $k['telefone']?></td>
                        <td><?php echo $k['email']?></td>
                        <td><?php echo $k['senha']?></td>
                <?php } ?>
    </body>
</html>

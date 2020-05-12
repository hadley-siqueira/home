<?php
  $user = "francisco050";
      $pass = "1234";
      $banco ="francisco050_contatos";
      $host = "localhost";
      $url = "mysql:host=$host;dbname=$banco";
 
    $conexao = new PDO($url, $user, $pass);

    $sql = "SELECT nome, telefone, email FROM Contatos";

    $comando = $conexao -> prepare($sql);
    $comando -> execute();
    
    $resultado = $comando->fetchAll();
?>

    <?php foreach($resultado as $k){ ?>
        <tr>
            <td> <?php echo $k['nome'] ?></td>
            <td> <?php echo $k['telefone'] ?></td>
            <td> <?php echo $k['email'] ?> </td>
        </tr>
    <?php } ?>

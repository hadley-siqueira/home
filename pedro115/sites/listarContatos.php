<?php
    $user = "pedro115";
    $pass = "1234";
    $banco = "pedro115_Agenda";
    $host = "localhost";
    $url = "mysql:host=$host;dbname=$banco";

    try {
      $conexao = new pdo($url, $user, $pass);

      $sql = "SELECT nome, telefone, email FROM Contatos";
      $comando = $conexao->prepare($sql);
      $comando->execute();
      $resultado = $comando->fetchAll();
    }  catch (PDOExeception $e) {
       echo "Error: " . $e->getmessage();
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
                    <th>Telefone</th>
                    <th>Email</th>
                  </tr>
             </thead>
             <tbody>
                <?php foreach ($resultado as $k){ ?>
          <tr>
            <td><?php echo $k['nome'] ?></td>
            <td><?phechon $k['telefone'] ?></td>
            <td><?php echo $k['email'] ?></td>
        </tr>
        <?php } ?>
    </tbody>
    </table>

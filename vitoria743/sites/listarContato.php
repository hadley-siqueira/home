<?php
    $user = "vitoria743";
    $pass = "1234";
    $banco = "hadley_Agenda";
    $host = "localhost";
    $url = "mysql:host=$host;dbname=$banco";

    try {
       $conexao = new PDO($url, $user, $pass);

       $sql = "SELECT nome, telefone, email FROM contatos";
       $comando = $conexao->prepare($sql);
       $comando->execute();
       $resultado = $comando->fatchALL();
      } catch (PDOException $e) {
        echo "Error:" . $e->getMessage();
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
               <?php foreach ($resultado as $k) { ?>
               <tr>
                 <td><?php echo $k['nome'] ?></td>
                 <td><?php echo $k['telefone'] ?></td>
                 <td><?php echo $k['email']?></td>
               </tr>
               <?php } ?>
            </tbody>
        </table>
       </body>
    </html>

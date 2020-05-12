<?php
    $user = "ellem360";
    $pass = "1234";
    $banco = "ellem360_Agenda";
    $host = "localhost";
    $url = "mysql:host=$host;dbname=$banco";


    try {
        $conexao = new PDO($url, $user, $pass);

        $sql = "SELECT nome, telefone, email FROM Contatos";
        $comando = $conexao->prepare($sql);
        $comando->execute();
        $resultado = $comando->fetchAll();
       } catch (PDOException $e) {
         echo "Error" .  $e->getMessage();
       }
?>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
    </head>

    <style>
#customers {
        font-family: "Robotic";
        border-collapse: collapse;
        width: 100%;
    }

    #customers td, #customers th {
        border: 1px solid #ddd;
        padding: 8px;
    }

    #customers tr:nth-child(even){background-color: #f2f2f2;}

    #customers tr:hover {background-color: #ddd;}

    #customers th {
        padding-top: 12px;
        padding-bottom: 12px;
        text-align: center;
        background-color: #CD6889;
        color: Black;
    }




    </style>

    <body>
        <table id="customers">
          <thead>
            <tr>
              <th>Nome</th>
              <th>Telefone</th>
              <th>Email</th>
            </th>
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
    </body>
</html>

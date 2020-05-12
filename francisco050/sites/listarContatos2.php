<?php
    $user = "francisco050";
    $pass = "1234";
    $banco= "francisco050_Agenda";
    $host ="localhost";
    $url  ="mysql:host=$host;dbname=$banco";

    
    try {
        $conexao = new PDO($url, $user, $pass);
        
        $sql = "SELECT nome, telefone, email FROM Contatos";
        $comando = $conexao->prepare($sql);
        $comando->execute();
        $resultado = $comando->fetchAll();
    } catch (PDOException $e){
        echo "Error: " .  $e->getMessage();
    }
?>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8"/>
        <style>
        #customers {
            font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
            border-collapse: collapse;
            width: 50%;
            margin: auto;
        }

        #customers td, #customers th {
            border: 1px solid #ddd;
            padding: 8px;
        }

        #customers tr:nth-child(even){
            background-color: #f2f2f2;
        }

        #customers tr:hover {
            background-color: #ddd;
        }

        #customers th {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: left;
            background-color: #4CAF50;
            color: white;
        }

        </style>
    </head>
    
    <body>
        <table id="customers">
    
  <tr>
        <h1 style="text-align: center;">Meus Contatos </h1>
    <th>Nome</th>
    <th>Telefone</th>
    <th>Email</th>
    <th>Excluir</th>
  </tr>
  <tr>
   <?php foreach ($resultado as $k) { ?>
      <tr>
        <td><?php echo $k['nome'] ?></td>

        <td><?php echo $k['telefone'] ?></td>

        <td><?php echo $k['email'] ?></td>
        <td><a href="excluir.php?nome=<?php echo $k['nome'] ?>">Excluir</a></td>
      </tr>
  <?php } ?>

</table> 


    </body>
</html>

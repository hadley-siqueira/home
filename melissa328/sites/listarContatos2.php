<?php
  $user = "melissa328";
  $pass = "1234";
  $banco = "melissa328_Agenda";
  $host = "localhost";
  $url = "mysql:host=$host;dbname=$banco";

  try {
    $conexao = new PDO($url, $user, $pass);
    
    $sql = "SELECT nome, telefone, email FROM Contatos";
    $comando = $conexao->prepare($sql);
    $comando->execute();
    $resultado = $comando->fetchAll();
}   catch (PDOException $e) {
    echo "ERROR: " . $e->getMessage();
}
?>

<!DOCTYPE html>
<html>
    <head>
        <style>
            #customers {
                font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
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
                text-align: left;
                background-color: #FF88C2;
                color: white;
            }
            .foo {
                background: url('https://st.depositphotos.com/2200898/2794/v/950/depositphotos_27947435-stock-illustration-classic-wallpaper-seamless-vintage-flower.jpg');
                background-size: cover;
            }
        </style>
         <meta charset="utf-8">
    </head>

    <body class="foo">
      <div style="width:70%; background-color: #fff; box-shadow: 0px 0px 5px #000; margin: auto; margin-top: 200px">
      <table id="customers">
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
      </div>
    </body>
</html>  

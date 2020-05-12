       
<?php
  $user = "vitoria042";
  $pass = "1234";
  $banco = "vitoria042_Agenda";
  $host = "localhost";
  $url = "mysql: host=$host;dbname=$banco";
    

  try {
    $conecxao = new PDO($url, $user, $pass);

    $sql = "SELECT nome, telefone, email FROM Contatos";
    $comando = $conecxao->prepare($sql);
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
    <style>
        body {margin:0; padding:0; height:100%;}
        section {float:left; width:100%; height:1000px; background:url("https://media.istockphoto.com/photos/green-background-picture-id475735358?k=6&m=475735358&s=612x612&w=0&h=bfiBpS8bwyzjYJEUHvmqj9BepXOC7TxpV1ZDc-VjsHg=") no-repeat; background-size: 100% 100%;}
       div {position: absolute; width:60%; background-color:#FFF; border-radius:5px; margin-left: 20%; padding-top:20px; padding-bottom:20px; margin-top:20px; margin-bottom: 20px; }
        table {
            float:left;
            margin-left:5%;
            width:90%;
        }
        table th {background-color: gold}
        table tr:nth-child(even) {background-color:#ddd;}   
    </style>
 </head>

  <body>
    <section>
    <div>
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
<tbody>
   </table>
    </div>
    <a href="formulariosobonita.php">novo contato</a>
  </section>
  </body>
</html>


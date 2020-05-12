<?php
  $user = "edvam018";
  $pass = "1234";
  $banco = "edvam018_Contatos";
  $host = "localhost";
  $url = "mysql:host=$host;dbname=$banco";

  try {
    $conexao = new PDO($url, $user, $pass);

    $sql = "SELECT nome, telefone, email FROM Contatos";
    $comando = $conexao->prepare($sql);
    $comando->execute();
    $resultado = $comando->fetchAll();

  
    foreach ($resultado as $k) { 
        echo "<td>" . $k['nome']     . "</td>";
        echo "<td>" . $k['telefone'] . "</td>";
        echo "<td>" . $k['email']    . "</td>"; 
    }
  } catch (PDOException $e) {
    echo "Error: " . $e->getMessage();
  }
?>

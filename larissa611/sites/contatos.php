<?php
    $user = "larissa611";
    $pass = "1234";
    $banco = "larissa611_Contatos";
    $host = "localhost";
    $url = "mysqlhost=$host;dbname=$banco";
    
      try {
        $conexao = new PDO($url, $user, $pass);

        $sql = "INSERT INTO Contatos(nome, telefone, email) VALUES (:nome, :email, :telefone)";

        $comando = $conexao->prepare($sql);

        $comando=$conexao->prepare($sql);
        $comando->$execute();
        $resultado=$comando->fetchAll();

        foreach ($resultado as $k) {
            echo "<td>" . $k['nome']  .  "</td>";
            echo "<td>" . $k['telefone']."</td>";
            echo "<td>" . $k['email']   ."</td>";
        }
        
      } catch (PDOException $e) {
        echo "Error: " . $e->getMessage();
        }

?>

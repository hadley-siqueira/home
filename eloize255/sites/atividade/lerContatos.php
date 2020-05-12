<?php
    $user = "eloize255";
     $pass = "1234";
     $banco = "eloize255_Contatos";
     $host = "localhost";
     $url = "mysql:host=$host;dbname=$banco";

    try {
        $conexao = new PDO ($url, $user, $pass);

        $sql = "SELECT nome, telefone, email FROM contatos";
        $comando = $conexao->prepare($sql);
        $comando->execute();
        $resultado = $comando->fetchAll();

            echo "Nome: " . $r['nome'] . "<br>";
        }
    } catch (PDOException $e) {
      echo "Error: " . $e->getMessage();
    }
?>


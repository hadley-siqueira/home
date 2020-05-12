<?php
    $user = "emanuelly417";
    $pass = "1234";
    $banco = "emanuelly417_Cadastro";
    $host = "localhost";
    $url = "mysql:host=$host;dbname=$banco";

    try {
        $conexao = new PDO($url, $user, $pass);

        $sql = "SELECT nome, telefone, email FROM Contatos";
        $comando = $conexao->prepare($sql);
        $comando->execute();
        $resultado = $comando->fetchAll();
    } catch (PDOException $e) {
        echo "Error: " . $e->getMessage();
    }
?>

<?php
    $user = "alana263";
    $pass = "1234";
    $banco = "alana263_Chat";
    $host = "localhost";
    $url = "mysql:host$host;dbname=$banco";
    $con = new PDO($url, $user, $pass);

    $sql = "INSERT INTO Mensagens (conteudo, usuario) VALUES (:conteudo, :usuario)";
    $stmt = $con->prepare($sql);
    $stmt->bindParam(':conteudo', $GET['conteudo']);
    $stmt->bindParam(':usuario', $GET['usuario']);
?>

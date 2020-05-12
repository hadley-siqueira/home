<?php
    $user = 'hadley'; // mude para seu usuario
    $pass = '1234';
    $banco = 'hadley_Chat'; // e para seu BD
    $host = 'localhost';
    $url = "mysql:host=$host;dbname=$banco";
    $con = new PDO($url, $user, $pass);

    $sql = "INSERT INTO Mensagens(conteudo, usuario) VALUES (:conteudo, :usuario)";
    $stmt = $con->prepare($sql);

    $stmt->bindParam(':conteudo', $_GET['conteudo']);
    $stmt->bindParam(':usuario', $_GET['usuario']);
    $stmt->execute();
?>

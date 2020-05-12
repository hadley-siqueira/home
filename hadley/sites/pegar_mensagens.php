<?php
    $user = 'hadley'; // mude para seu usuario
    $pass = '1234';
    $banco = 'hadley_Chat'; // e para seu BD
    $host = 'localhost';
    $url = "mysql:host=$host;dbname=$banco";
    $con = new PDO($url, $user, $pass);

    $sql = "SELECT * FROM Mensagens ORDER BY id DESC";
    $resultado = $con->query($sql)->fetchAll();

    echo "<div class=\"chat\">";
    foreach ($resultado as $r) {
        echo "<div class=\"msg\">";
        echo "<h3>" . $r['usuario'] . " diz:</h3>";
        echo "<p>" . $r['conteudo'] . "</p>";
        echo "</div>";
    }
    echo "</div>";
?>

<?php
    $host = 'localhost';
    $user = 'usuarioPHP';
    $bd = 'aulaPHP';
    $pass = 'macau123';
    $url = "mysql:host=$host;bdname=$bd";
    $pdo = new PDO($url, $user, $pass);

if (!$pdo) {
    die('Erro ao criar uma conexão');
} else {
    echo 'Conectou';

        $sql = 'select nome, email from Contatos';
        $res = $pdo->query($sql)->fetchALL();
        echo 'Conectou';

        foreach ($res as $r) {
            echo "Nome:" . $r['nome'] . '<br>';
            echo "Email:" . $r['email'] . "<br>";
        }
    }
?>

<?php
    $host = 'localhost';
    $user = 'usuarioPHP';
    $bd = 'aulaPHP';
    $pass = 'macau123';
    $url = "mysql:host=$host;dbname=$bd";
    $pdo = new PDO($url, $user, $pass);

if (!$pdo) {
    die('Erro ao criar uma conexão');
} else {
    echo 'Conectou';

    $sql = 'select nome, id, preco, qtd from Produtos';
    $res = $pdo->query($sql)->fetchAll();

    foreach ($res as $r) {
        echo "Nome:" . $r['nome'] . '<br>';
        echo "Id:" . $r['id'] . "<br>";
        echo "Preço:" . $r['preco'] . "<br>";
        echo "Quantidade:" . $r['qtd'] . "<br>";
    }
}
?>

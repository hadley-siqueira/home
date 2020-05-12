<?php
$host = 'localhost';
$user = 'usuarioPHP';
$db = 'aulaPHP';
$pass = 'macau123';
$url = "mysql:host=$host;dbname=$db";
$sh = new PDO($url, $user, $pass);

if (!$sh) {
    die ('Erro ao criar conexão');
}else{
    echo 'conectou';

    $sql = 'select nome, id, preco, qtd from Produtos';
    $res = $sh->query($sql)->fetchAll();

    foreach ($res as $r) {
        echo "Nome: " . $r['nome'] . '<br>';
        echo "Id:". $r['id'] . '<br>';
        echo "preco:". $r['preco'] . '<br>';
        echo "Qtd:". $r['qtd'] . '<br>';




    }
}

?>

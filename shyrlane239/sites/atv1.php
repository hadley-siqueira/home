<?php
$host = 'localhost';
$user = 'usuarioPHP';
$db = 'aulaPHP';
$pass = 'macau123';
$url = "mysql:host=$host;dbname=$db";
$pdo = new PDO($url, $user, $pass);
if(!$pdo){
    die('Erro ao criar a conexão');
}else{
    echo 'Conectou';

    $sql = 'select id, nome, preco, qtd from Produtos';
    $res = $pdo->query($sql)->fetchAll();

    foreach ($res as $r) {
       
        echo "Id: " . $r['id'] . "<br>";
        echo "Nome: " . $r['nome'] . '<br>';
        echo "Preco: " . $r['preco'] . "<br>";
        echo "Qtd: " . $r['qtd'] ." <br>";
     
 }
}
?>

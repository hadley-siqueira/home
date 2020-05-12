<?php
$st= 'localhost';
$user= 'usuarioPHP';
$db  = 'aulaPHP';
$pass= 'macau123';
$url = "mysql:host=$host;dbname=$db";
$sh = new PDO($url,$user,$pass);

    if(!$sh){
        die('Erro ao criar conexao');
   }else {
        echo 'Conectou';

    $sql = 'select nome, id, preco, qtd  from Produtos';
    $res = $sh->query($sql)->fetchall();

    foreach ($res as $r) {
        echo "id: " . $r['id'] .  '<br>';
        echo "Nome: " . $r['nome'] . '<br>';
        echo "Preco: " . $r['preco'] . "<br>";
        echo "Quantidade: " . $r['qtd'] . '<br>';
    }
}
?>


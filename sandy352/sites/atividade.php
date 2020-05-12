<?php
$host = 'localhost';
$user = 'usuarioPHP';
$db   = 'aulaPHP';
$pass = 'macau123';
$url  = "mysql:host=$host;dbname=$db";
$sh   = new PDO($url, $user, $pass);

if(!$sh){
   die('Erro ao criar a conexão');
} else {
   echo 'Conectou';

    $sql = 'select id, nome,preco,qtd from Produtos';
    $res = $sh->query($sql)->fetchAll();

    foreach ($res as $r) {
        echo "NumerodoId: " . $r['id'] . '<br>';
        echo "Nome: " . $r['nome'] . "<br>";
        echo "Preço: " . $r['preco'] . "<br>";
        echo "Quantidade: " . $r['qtd'] . "<br>";

    } 
}

?>

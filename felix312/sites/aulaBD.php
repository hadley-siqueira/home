<?php
$host= 'localhost';
$user= 'usuarioPHP';
$db  = 'aulaPHP';
$pass= 'macau123';
$url = "mysql:host=$host;dbname=$db";
$sh = new PDO($url,$user,$pass);

    if(!$sh){
        die('Erro ao criar conexao');
   }else {
        echo 'Conectou';

    $sql = 'select nome, email from Contatos';
    $res = $sh->query($sql)->fetchall();

    foreach ($res as $r) {
        echo "Nome: " . $r['nome'] . '<br>';
        echo "Email: " . $r['email'] . "<br>";
    }
}
?>

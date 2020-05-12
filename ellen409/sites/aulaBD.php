<?php
$host = 'localhost';
$user= 'usuarioPHP';
$db = 'aulaPHP';
$pass = 'macau123';
$url = "mysql:$host=$localhost;dbname=$db";
$pdo = new PDO($url, $user, $pass);

if(!pdo){
    die('Erro ao criar conexão');
}else{
    echo 'Conectou';
}

?>

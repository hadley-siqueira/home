<?php
$v1     = 'localhost';
$abc    = 'aulaPHP';
$hahaha = 'usuarioPHP';
$bua    = 'macau123';
$url    = "mysql:host=$v1;dbname=$abc";

$conexao = new PDO ($url, $hahaha, $bua);

if ($conexao) {
    $sql = 'select nome, email from Contatos';
    $resultado = $conexao->query($sql)->fetchAll();

    foreach ($resultado as $linha) {
        echo "Nome: " . $linha['nome'] . "<br>";
        echo "Email: " . $linha['email'] . "<br>";
        echo "<br>";
    }
}

?>

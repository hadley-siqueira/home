<?php
$vl = 'localhost';
$abc = 'julio603_Contatos';
$hahaha = 'julio603';
$bua = '1234';
$url = "mysql:host=$vl;dbname=$abc";

$conexao = new PDO($url, $hahaha, $bua);

if($conexao) {

$sql = 'select nome, telefone, email from Lista_contatos';
$resultado = $conexao->query($sql)->fetchAll();

foreach ($resultado as $linha) {
    echo "Nome: " . $linha['nome'] . "<br>";

    echo "Telefone: " . $linha['telefone'] . "<br>";

    echo "Email: " . $linha['email'] . "<br>";

    echo "<br>";

    }
}

?>


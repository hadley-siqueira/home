<?php
$v1      = 'localhost';
$abc     = 'aulaPHP';
$hahaha  = 'usuarioPHP';
$bua     = 'macau123';
$url     = "mysql:host=$v1;dbname=$abc";

$conexao = new PDO($url, $hahaha, $bua);
if ($conexao) {
    $sql = 'select id, nome, preco, qtd from Produtos';
    $resultado = $conexao->query ($sql)->fetchAll();

    foreach ($resultado as $linha) {
        echo "ID " . $linha ['id'] . "<br>";
        echo "Nome: " . $linha ['nome'] . "<br>";
        echo "Preço: " . $linha ['preco'] . "<br>";
        echo "Quantidade: " . $linha ['qtd'] . "<br>";
        echo "<br>";
     }
}

?>


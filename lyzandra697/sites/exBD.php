<?php
$v1     = 'localhost';
$abc    = 'aulaPHP';
$haha   = 'usuarioPHP';
$bua    = 'macau123';
$url    = "mysql:host=$v1;dbname=$abc";

$conexao = new PDO($url, $haha, $bua);

if ($conexao) {
    $sql = 'select id, nome, preco, qtd from Produtos';
    $resultado = $conexao->query($sql)->fetchAll();

    foreach ($resultado as $linha) {

        echo "Id: " . $linha['id'] . "<br>";
        echo "Nome: " . $linha['nome'] . "<br>";
        echo "Preco: " . $linha['preco'] . "<br>";
        echo "Qtd: " . $linha['qtd'] . "<br>";
        echo "<br>";
    }
}
?>


<?php
$vl = 'localhost';
$abc = 'aulaPHP';
$hahaha = 'usuarioPHP';
$bua = 'macau123';
$url = "mysql:host=$vl;dbname=$abc";

$conexao = new PDO($url, $hahaha, $bua);

if ($conexao) {
    $sql = 'select id, nome, preco, qtd from Produtos';
    $resultado = $conexao->query($sql)->fetchAll();

    foreach ($resultado as $linha) {
        echo "id" . $linha['id'] . "<br>";
        echo "nome" . $linha['nome'] . "<br>";
        echo "preco" . $linha['preco'] . "<br>";
        echo "qtd" . $linha['qtd'] . "<br>";
        echo "<br>";   
    }

}

?>

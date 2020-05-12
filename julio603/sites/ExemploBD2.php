<?php
$vl = 'localhost';
$abc = 'aulaPHP';
$hahaha = 'usuarioPHP';
$bua = 'macau123';
$url = "mysql:host=$vl;dbname=$abc";

$conexao = new PDO($url, $hahaha, $bua);

if($conexao) {

$sql = 'select id, nome, preco, qtd from Produtos';
$resultado = $conexao->query($sql)->fetchAll();

foreach ($resultado as $linha) {
    echo "identificacao do produto: " . $linha['id'] . "<br>";

    echo "Nome: " . $linha['nome'] . "<br>";

    echo "Preço do produto: " . $linha['preco'] . "<br>";   

    echo "Quantidade de produtos: " . $linha['qtd'] . "<br>";

     echo "<br>";

    }
}

?>

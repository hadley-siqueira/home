asdasd

<?php
	$host = 'localhost';
        $user = 'usuarioPHP';
        $db = 'aulaPHP';
        $pass = 'macau123';
        $url = "mysql:host=$host;dbname=$db";
        $pdo = new PDO($url, $user, $pass);

        if(!$pdo) {
                die('Erro ao ciar a conexão');
        } else {
                echo 'Conectou';

                $sql = 'select id,nome, preco, qtd from Produtos';
                $res = $pdo->query($sql)->fetchAll();

                foreach ($res as $r) {
                        echo "Nome: " . $r['nome'] . '<br>';
                        echo "id: " . $r['id'] . "<br>";
                        echo "preco: " . $r['preco'] . '<br>';
                        echo "qtd: " . $r['qtd'] . '<br>';
                }
        }
?>

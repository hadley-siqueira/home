<?php
        $host = 'localhost';
       $user = 'usuarioPHP';
        $bd = 'aulaPHP';
        $pass = 'macau123';
        $url = "mysql:$host=$localhost;bdname=$bd";
        $pdo = new PDO($url, $user, $pass);

        if(!$pdo) {
          die('Erro ao ciar a conexão');
        } else {
                echo 'Conectou';
                
                $sql = 'select nome, email from contatos';
                $res = $pdo->query($sql)->fetchAll();

                foreach ($res as $r) {
                        echo "Nome: " . $r['nome'] . '<br>';
                        echo "Email: " . $r['email'] . "<br>";
                }
        }
?>


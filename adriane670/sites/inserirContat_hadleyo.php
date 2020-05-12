<?php
    $user = 'adriane670';
    $pass = '1234';
    $host = 'localhost';
    $banco = 'adriane670_agenda';
    $url = "mysq:host=$host;dbname=$banco";

    try {
        $conexao = new PDO($url, $user, $pass);

        $sql = "insert into contatos(nome, telfone, email) values (:nome, :telefone, :email)";
        $comando = $conexao->prepare($sql);
        
        $comando->bindParam(':nome', $_PASS['nome']);
        $comando->bindParam(':telefone', $_PASS['telefone']);
        $comando->bindParam(':email', $_PASS['email']);

        $comando->execute();
    } catch (PDOEXception $e) {
        echo $e->getMessage();
    }
?>

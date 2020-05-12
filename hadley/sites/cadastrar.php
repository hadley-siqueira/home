<?php

    $nome = $_GET['nome'];
    $telefone = $_GET['tel'];
    $email = $_GET['email'];

    $host = 'localhost';
    $user = 'usuarioPHP';
    $pass = 'macau123';
    $bd   = 'aulaPHP';
    $url  = "mysql:host=$host;dbname=$bd";

    $con = new PDO($url, $user, $pass);

    if ($con) {
        $sql = "insert into Contatos values ";
        $sql = $sql . "('$nome', '$telefone', '$email')";

        echo "Rodando: $sql";
        $executa = $con->query($sql);

        if($executa){
          echo 'Dados inseridos com sucesso!';
        }
        else{
            echo 'aqui';
          print_r($con->errorInfo());
        }
    }
?>

<?php
    $user = "alana263";
    $pass = "1234";
    $banco = "alana263_Projeto";
    $host = "localhost";
    $url = "mysql:host=$host;dbname=$banco";

    try {
        $conexao = new PDO($url, $user, $pass);

        $sql = "INSERT INTO Sereias(nome, cor, idade, poderes) VALUES (:nome, :cor, :idade, :poderes)";

        $comando = $conexao->prepare($sql);


        $campos = array('nome', 'cor', 'idade', 'poderes');

        foreach ($campos as $c) {
            $comando->bindParam(":$c", $_POST[$c]);
        }

       $comando->execute();
            header('Location: deucerto.html');
    } catch (PDOException $e){
        echo "Eror: " . $e->getMessage();
      }
?>


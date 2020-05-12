<?php
    $user = "ellen409";
    $pass ="1234";
    $banco = "ellen409_agenda";
    $host = "localhost";
    $url = "mysql:host=$host;dbname=$banco";

    try {
        $conexao = new PDO($url, $user, $pass);

        $sql = "INSERT INTO Alunos(matricula, nome, cpf, idade, pai, mae, telefone, email, endereco) VALUES (:matricula, :nome, :cpf, :idade, :pai, :mae, :telefone, :email, :endereco)";
        $comando = $conexao->prepare($sql);

        $comando->bindParam(':matricula', $_POST['matricula']);
        $comando->bindParam(':nome', $_POST['nome']);
        $comando->bindParam(':cpf', $_POST['cpf']);
        $comando->bindParam(':idade', $_POST['idade']);
        $comando->bindParam(':pai', $_POST['pai']);
        $comando->bindParam(':mae', $_POST['mae']);
        $comando->bindParam(':telefone', $_POST['telefone']);
        $comando->bindParam(':email', $_POST['email']);
        $comando->bindParam(':endereco', $_POST['endereco']);

        $res = $comando->execute();
        $comando->debugDumpParams();

        if ($res) {
            echo "done";
        } else {
            echo "fail";
        }

//        header('Location: listarContatos3.php');
    } catch (PDOException $e) {
      echo "Erro:" .$e->getMessage();
    }
?>

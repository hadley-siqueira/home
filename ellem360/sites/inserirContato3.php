<?php

    $user = "ellem360";
    $pass = "1234";
    $banco = "ellem360_Agenda";
    $host = "localhost";
    $url = "mysql:host=$host;dbname=$banco";

    try {
        $conexao = new PDO($url, $user, $pass);

        $sql = "INSERT INTO Alunos(Matricula, Nome, Cpf, Idade, Pai, Mae, Telefone, Email, Endereco) VALUES (:Matricula, :Nome, :Cpf, :Idade, :Pai, :Mae, :Telefone,: Email,:Endereco)";

        $comando = $conexao->prepare($sql);

        $comando->bindParam(':Matricula', $_POST['Matricula']);
        $comando->bindParam(':Nome', $_POST['Nome']);
        $comando->bindParam(':Cpf', $_POST['Cpf']);
        $comando->bindParam(':Idade', $_POST['Idade']);
        $comando->bindParam(':Pai', $_POST['Pai']);
        $comando->bindParam(':Mae', $_POST['Mae']);
        $comando->bindParam(':Telefone', $_POST['Telefone']);
        $comando->bindParam(':Email', $_POST['Email']);
        $comando->bindParam(':Endereco', $_POST['Endereco']);





        $comando->execute();
        header('Location: listarContatos3.php');
        }catch (PDOException $e) {
         echo "Error:" . $e->getMessage();
        }
?>


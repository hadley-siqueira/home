<?php
    $user = "maria085";
    $pass = "1234";
    $banco = "maria085_Agenda";
    $host = "localhost";
    $url = "mysql:host=$host;dbname=$banco";

    try {
        $conexao = new PDO($url, $user, $pass);

        $sql = "INSERT INTO Alunos(matricula, nome, cpf, idade, pai, mae, telefone, email, endereco) VALUES (:matricula, :nome, :cpf, :idade, :pai, :mae, :telefone, :email, :endereco)";

        $comando = $conexao->prepare($sql);

        $campos = array('matricula', 'nome', 'cpf', 'idade', 'pai', 'mae', 'telefone', 'email', 'endereco');

        foreach ($campos as $c) {
            $comando->bindParam(":$c", $_POST[$c]);
        }

        $comando->execute();
        header('Location: listarAlunos.php');
    } catch (PDOException $e){
        echo "Error: " . $e->getMessage();
    }
?>

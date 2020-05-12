<?php
  $user = "lyzandra697";
  $pass = "1234";
  $banco = "lyzandra697_Agenda2";
  $host = "localhost";
  $url = "mysql:host=$host;dbname=$banco";

  try{
    $conexao = new PDO($url, $user, $pass);

    $sql = "INSERT INTO Contatos(matricula, nome, cpf, idade, pai, mae, telefone, email, endereco) VALUES (:matricula, :nome, :cpf, :idade, :pai, :mae, :telefone, :email, :endereco)";

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


    $comando->execute();
    header('Location: listarAlunos.php');
  } catch (PDOException $e) {
    echo "Error: " . $e->getMessage();
  }
?> 



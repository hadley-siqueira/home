<?php

 $user ="fabricio123";
 $pass ="1234";
 $banco ="fabricio123_Agenda";
 $host ="localhost";
 $url ="mysql:host=$host;dbname=$banco";

 try{
   $conexao = new PDO($url, $user, $pass);

   $sql = "INSERT INTO Alunos(nome, cpf, idade, pai, mae, telefone, email, matricula) VALUES (:nome, :cpf, :idade, :pai, :mae, :telefone, :email, :matricula)";

   $comando = $conexao->prepare($sql);

   $comando->bindParam(':nome', $_POST['nome']);
   $comando->bindParam(':cpf', $_POST['cpf']);
   $comando->bindParam(':idade', $_POST['idade']);
   $comando->bindParam(':pai', $_POST['pai']);
   $comando->bindParam(':mae', $_POST['mae']);
   $comando->bindParam(':telefone', $_POST['telefone']);
   $comando->bindParam(':email', $_POST['email']);
   $comando->bindParam(':matricula', $_POST['matricula']);


   $comando->execute();
   header('Location: listarAluno.php');
  } catch (PDOException $e) {
    echo "Error: " . $e->getMessage();
  }
?>


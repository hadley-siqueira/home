<?php

 $user ="emanuelly417";
 $pass ="1234";
 $banco ="emanuelly417_agenda";
 $host ="localhost";
 $url ="mysql:host=$host;dbname=$banco";

 try{
   $conexao = new PDO($url, $user, $pass);

   $sql = "INSERT INTO Alunos(nome, telefone, email) VALUES (:nome,:telefone, :email)";

   $comando = $conexao->prepare($sql);

   $comando->bindParam(':nome', $_POST['nome']);
   $comando->bindParam(':telefone', $_POST['telefone']);
   $comando->bindParam(':email', $_POST['email']);

   $comando->execute();
   header('Location: listarContatos3.php');
  } catch (PDOException $e) {
    echo "Error: " . $e->getMessage();
  }
?>


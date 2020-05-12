<?php

 $user ="fabricio123";
 $pass ="1234";
 $banco ="fabricio123_Agenda";
 $host ="localhost";
 $url ="mysql:host=$host;dbname=$banco";

 try{
   $conexao = new PDO($url, $user, $pass);

   $sql = "INSERT INTO Contatos(nome, telefone, email) VALUES (:nome,:telefone, :email)";

   $comando = $conexao->prepare($sql);

   $comando->bindParam(':nome', $_POST['nome']);
   $comando->bindParam(':telefone', $_POST['telefone']);
   $comando->bindParam(':email', $_POST['email']);

   $comando->execute();
   header('Location: listarContatos2.php');
  } catch (PDOException $e) {
    echo "Error: " . $e->getMessage();
  }
?>


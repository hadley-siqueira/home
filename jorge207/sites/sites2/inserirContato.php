<?php
   $user = "jorge207";
   $pass = "1234";
   $banco = "jorge207_Agenda";
   $host = "localhost";
   $url = "mysql:host=$host;dname=$banco";

   try {
     $conexao = new PDO($url, $user, $pass);

     $sql = "INSERT INTO Contatos(nome, telefone, email) VALUES (:NOME,:telefone,:email)";

     $comando = $conexao->prepare($sql);

     $comando->bindParam(':nome',$_POST['nome']);
     $comando->bindParam(':telefone',$_POST['telefone']);
     $comando->bindParam(':email',$_POST['email']);

     $comando->execute();
     header('Location: listarContatos.php');
    } catch (PDOException $e) {
      echo "Error:" . $e->getMessage();
 }
?>

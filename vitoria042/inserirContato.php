<?php
  $user = "vitoria042";
  $pass = "1234";
  $banco = "vitoria042_Agenda";
  $host = "localhost";
  $url  ="mysql: host=$host;dbname=$banco";
  
  try {
     $conecxao = new PDO($url, $user, $pass);
 
     $sql = "INSERT INTO Contatos(nome, telefone, email) VALUES(:nome, :telefone, :email)";

     $comando = $conecxao->prepare($sql);

     $comando->bindParam(':nome', $_POST['nome']);
     $comando->bindParam(':telefone', $_POST['telefone']);
     $comando->bindParam(':email', $_POST['email']);
   
     $comando->execute();
     header('location: listarContatos.php');
   } catch (PDOException $e) {
   
   }
?>

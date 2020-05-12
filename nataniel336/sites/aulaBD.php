<?php
   $host = 'localhost';
   $user = 'usuarioPHP';
   $db = 'aulaPHP';
   $pass = 'macau123';
   $url = "mysql:host=$host;dbname=$db";
   $pdo = new PDO($url, $user, $pass);

   if(!$pdo){
      die('Erro ao criar conexão');
   } else {
      echo 'Conectou';
       
       $sql = 'select nome, email from Contatos';
       $res = $pdo->query($sql)->fetchAll();
  
       foreach ($res as $r) {
           echo "Nome: " . $r['nome'] . '<br>';
           echo "Email: " . $r['emal'] . '<br>';
       }
 }
  
?>

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
       
       $sql = 'select id, qtd, nome, preco from Produtos';
       $res = $pdo->query($sql)->fetchAll();
  
       foreach ($res as $r) {
           echo "Id: " . $r['Id'] . '<br>';
           echo "Nome: " . $r['Nome'] . '<br>';
           echo "Preço: " . $r['preco'] . '<br>';
           echo "qtd: " . $r['qtd'] . '<br>';

      }
}
  
?>

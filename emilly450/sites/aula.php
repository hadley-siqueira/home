<?php
$host = 'localhost';
$user = 'usuarioPHP';
$db = 'aulaPHP';
$pass = 'macau123';
$url = "mysql:host=$host;dbname=$db";
$pdo = new PDO($url, $user, $pass);
   if(!$pdo){
       die('Erro ao criar a conexão');
   }else {
     echo 'Conectou';
      $sql = 'select nome,id, preco, qtd from Produtos';
      $res = $pdo->query($sql)->fetchAll();

      foreach ($res as $r) {
          echo "Nome: " . $r['nome'] . '<br>';
          echo "Id: " . $r['id'] . "<br>";
          echo "Preco " . $r['preco'] . "<br>";
          echo "Quantidade" . $r['qtd'] . "<br>";
      }
}

?>

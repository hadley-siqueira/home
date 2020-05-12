<?php
$v1   ='localhost';
$abc  ='aulaPHP';
$haha ='usuarioPHP';
$bua  ='macau123';
$url  ="mysql:host=$v1;dbname=$abc";

$conexao = new PDO($url,$haha,$bua);

if($conexao){
   $sql='select id ,nome,preco,qtd  from Produtos';
   $resultado = $conexao->query($sql)->fetchAll();

   foreach($resultado as $linha){
         echo"id:" .$linha['id'] ."<br>";
         echo"nome:"   .$linha['nome']    ."<br>";
         echo "preco:" .$linha['preco'] ."<br>";
         echo "qtd:"   .$linha['qtd']     ."<br>";
         echo"<br>";
         
  }
}

?>


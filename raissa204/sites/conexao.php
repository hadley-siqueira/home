<?php
class conexao{
   public function getConexao(){
    $user='raissa204';
    $pass=1234;
    $banco= 'raissa204_empresa';
    $host='localhost';
    $url="mysql:host=$host;dbname=$banco";
    $con=new PDO($url,$user,$pass);
    return $con;

 }

}
?>

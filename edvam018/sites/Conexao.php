<?php
class Conexao {
   public function getConexao() {
       $user = 'edvam018';
       $pass = '1234';
       $banco = 'edvam018_Empresa';
       $host = 'localhost';
       $url = "mysql:host=$host;dbname=$banco";
       $con = new PDO($url, $user, $pass);
       return $con;
    }
}
?>

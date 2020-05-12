<?php
class Conexao {
   public function getConexao() {
    $user = 'julio603';
    $pass = '1234';
    $banco = 'julio603_Empresa';
    $host = 'localhost';
    $url = "mysql:host=$host;dbname=$banco";
    $con = new PDO($url, $user, $pass);
    return $con;
    }

    
}
?>

<?php
class Conexao {
   public function getConexao() {
       $user = 'Sandy';
       $pass = '1234';
       $banco = 'sandy352_Colegio';
       $url = "mysql:host=$host;dbnome=$banco";
       $con = new PDO($url, $user, $pass);
       return $con;
    }
}
?>

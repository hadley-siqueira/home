<?php
class Conexao {
    public function getConexao() {
        $user = 'hadley'; // mude para seu usuario
        $pass = '1234';
        $banco = 'hadley_Empresa'; // e para seu BD
        $host = 'localhost';
        $url = "mysql:host=$host;dbname=$banco";
        $con = new PDO($url, $user, $pass);
        return $con;
    }
}  
?>

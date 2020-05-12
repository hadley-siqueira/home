<?php
class Conexao {
    public function getConexao() {
        $user = 'nataniel336';
        $pass = '1234';
        $host = 'localhost';
        $banco = 'nataniel336_Colegio';
        $url =  "mysql:host=$host;dbname=$banco";
        $con = new PDO($url, $user, $pass);
        return $con;
    }
}
?>

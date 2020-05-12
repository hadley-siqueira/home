<?php
class Conexao {
    public function getConexao() {
        $user = 'adriane670';
        $pass = '1234';
        $banco = 'adriane670_Empresa';
        $host = 'localhost';
        $url = "mysql:host=$host;dbname=$banco";
        $con = new PDO($url, $user, $pass);
        return $con;
    }
}
?>

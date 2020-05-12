<?php
class Conexao {
    public function getConexao() {
        $user = 'emanuelly417';
        $pass = '1234';
        $banco = 'emanuelly417_empresa';
        $host = 'localhost';
        $url ="mysql:host=$host;dbname=$banco";
        $com = new PDO($url, $user, $pass);
        return $con;
    }
?>

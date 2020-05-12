<?php
class Conexao {
    public function getConexao() {
        $user = 'fabricio123';
        $pass = '1234';
        $banco = 'fabricio123_Empresa';
        $host = 'localhost';
        $url = "mysql:host=$host;dbname=$banco";
        $con = new PDO($url, $user, $pass);
        return $con;
    }
}
?>

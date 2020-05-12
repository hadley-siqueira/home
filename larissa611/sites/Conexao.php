<?php
class Conexao {
    public function getConexao() {
        $user = 'larissa611';
        $pass = '1234';
        $banco = 'larissa611_Empresa';
        $host = 'localhost';
        $url = "mysql:host=$host;dbname=$banco";
        $con = new PDO ($url, $user, $pass);
        return $con;
    }
}
?> 

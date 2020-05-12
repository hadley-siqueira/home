<?php
class Conexao {
    public function getConexao() {
        $user = 'pedro115';
        $pass = '1234';
        $banco = 'pedro115_colegio';
        $host = 'localhost';
        $url = "mysql:host=$host; dbname=$banco";
        $con = new PDO ($url, $user, $pass);
        return $con;
    }
}
?>

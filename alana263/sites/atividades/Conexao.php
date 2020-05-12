<?php
class Conexao {
    public function getConexao() {
        $user = 'alana263';
        $pass = '1234';
        $host = "localhost";
        $banco = 'alana263_Colegio';
        $url = "mysql:host=$host;dbname=$banco";
        $con = new PDO($url, $user, $pass);
        return $con;
    }
}
?>

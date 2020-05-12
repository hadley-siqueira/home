<?php
class Conexao {
    public function getConexao() {
        $user = 'eloize255';
        $pass = '1234';
        $banco = 'eloize255_Empresa';
        $host = 'localhost';
        $url = "mysql:host=$host;dbname=$banco";
        $con = new PDO ($url, $user, $pass);
        return $con;
    }
}
?>

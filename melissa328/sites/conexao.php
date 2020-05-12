<?php
class Conexao {
    public function getConexao() {
        $user = 'melissa328';
        $pass = '1234';
        $banco = 'melissa328_Empresa';
        $host = 'localhost';
        $url = "mysql:host=$host;dbname=$banco";
        $con = new PDO ($url, $user, $pass);
        return $con;
    }
}
?>

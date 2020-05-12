<?php
class Conexao {
    public function getConexao() {
        $user = 'maria085';
        $pass = '1234';
        $banco = 'maria085_colegio';
        $url = "mysql:host=$host;dbname=$banco";
        $con = new PDO($url, $user, $pass);
        return $con;
    }
}
?>

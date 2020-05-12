<?php
class conexao {
    public function getConexao() {
        $user = 'lyzandra697';
        $pass = '1234';
        $banco = 'lyzandra697_Empresa';
        $host = 'localhost';
        $url = "mysql:host=$host;dbname=$banco";
        $con = new PDO($url, $user, $pass);
        return $con;
    }
}
?>


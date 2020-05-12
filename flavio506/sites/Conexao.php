<?php
class Conexao {
    public function getConexao() {
        $user = 'flavio506';
        $pass = '1234';
        $host = 'localhost';
        $banco = 'flavio506_tabela';
        $url = "mysql:host=$host;dbname=$banco";
        $con = new PDO($url, $user, $pass);
        return $con;
    }
}
?>

<?php
class Conexao {
    public function getConexao() {
        $user = 'shyrlane239';
        $pass = '1234';
        $host = 'localhost';
        $banco = 'shyrlane239_Colegio';
        $url = "mysql:host=$host;dbname=$banco";
        $con = new PDO($url, $user, $pass);
        return $con;
    }
}
?>


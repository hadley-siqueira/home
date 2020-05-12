<?php
class Conexao { 
    public function getConexao() {
        $user = 'felix312'; 
        $pass = '1234';
        $banco = 'felix312_Empresa';
        $host = 'localhost';
        $url = "mysql:host=$host;dbname=$banco";
        $con = new PDO($url, $user, $pass);
        return $con;
    }
}
?>

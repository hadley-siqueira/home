<?php
class Conexao {
    public function getConexao(){
        $user = 'francisco050';
        $pass = '1234';
        $banco  = 'francisco050_Empresa';
        $host = 'localhost';
        $url = "mysql:host=$host;dbname=$banco";
        $con = new PDO ($url, $user, $pass);
        return $con;
    }
}

?>

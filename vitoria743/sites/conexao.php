<?php
class conexao {
    public function getConexao() {
        $user = 'vitoria743'; 
        $pass = '1234';
        $banco = 'vitoria743_Empresa';
        $host = 'localhost';
        $url = "msql:host=$host;dbname=$banco";
        $con = new PDO($url,$user, $pass);
        return $con;
    }
}
?>

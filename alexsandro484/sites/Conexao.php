<?php
	class Conexao{
		public function getConexao() {
			$user = 'alexsandro484';
			$pass = '1234';
			$banco = 'alexsandro484_Colegio';
			$url = "mysql:host=$host;dbname=$banco";
			$con = new PDO($url, $user, $pass);
			return $con
		}
	}
?>

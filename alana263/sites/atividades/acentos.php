<?php
# Informa qual o conjunto de caracteres será usado.
header('Content-Type: text/html; charset=utf-8');

# Conecta ao banco de dados
$conexao = mysql_connect('localhost','alana263','1234');
$banco = mysql_select_db('alana263_banco');

# Aqui está o segredo
mysql_query("SET NAMES 'utf8'");
mysql_query('SET character_set_connection=utf8');
mysql_query('SET character_set_client=utf8');
mysql_query('SET character_set_results=utf8');
?>

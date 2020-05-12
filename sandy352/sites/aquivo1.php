<?php
require 'aquivo.php';

$aluno = new Aluno();
$aluno ->setNome('Sandy');

echo 'O nome do aluno é: '.$aluno->getNome();
?>

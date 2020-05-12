<?php
require 'aluno.php';

$aluno = new Aluno();
$aluno->setNome('Duda');

echo 'O nome do aluno eh ' . $aluno->getNome();
?>

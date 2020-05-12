<?php
require 'Aluno.php';
require 'AlunoDAO.php';

$aluno = new Aluno();
$aluno->setNome('Hadley');

echo 'O nome do aluno eh: ' . $aluno->getNome();

$dao = new AlunoDAO();
$aluno = $dao->getAlunoByMatricula('20151074');

echo 'O nome do aluno eh: ' . $aluno->getNome();
?>

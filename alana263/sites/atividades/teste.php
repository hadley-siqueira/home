<?php
require 'Aluno.php';
require 'dao.php';
$aluno = new Aluno();
$aluno->setNome('Alana');

echo 'O nome do aluno é: ' . $aluno->getNome() . '<br>';

$dao = new AlunoDAO();
$aluno = $dao->getAlunoByMatricula('20151074010263');

echo 'O nome do aluno é: ' . $aluno->getNome() . '<br><br>';

$alunos= $dao->getTodosAlunos();

foreach ($alunos as $a) {
    echo 'O nome do aluno é: ' . $a->getNome() . '<br>';
}

?>

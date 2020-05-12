<?php
	require 'Aluno.php';

	$aluno = new Aluno();
	$aluno->setNome('Alexsandro');

	echo 'O nome do aluno é ' . $aluno->getNome();

	$dao = new AlunoDAO();
	$aluno = $dao->getAlunoByMatricula('2018001');

	echo 'O nome do aluno é ' . $aluno->getNome();
?>

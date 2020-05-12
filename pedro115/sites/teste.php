<?php
           require 'Aluno.php';
           require 'AlunoDAO.php'; 

           $aluno = new Aluno();
           $aluno->setNome('pedro115');

           echo 'O nome do aluno é' . $aluno->getNome();

           $dao = new AlunoDAO();
           $aluno = $dao->getAlunoByMatricula('2018001');

           echo 'o nome do aluno eh' . $aluno->getNome();
?>
  

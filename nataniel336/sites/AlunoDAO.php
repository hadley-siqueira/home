<?php
require 'Conexao.php';

class AlunoDAO {
    public function getAlunoByMatricula($m) {
        $con = (new Conexao())->getConexao();
        $sql = "select * from Aluno where matricula=$m";
        $tab = $con->query($sql)->fetchAll();

        $aluno = new Aluno();

        foreach ($tab as $t) {
          $aluno->setNome($t['nome']);
          $aluno->setIdade($t['idade']);
          $aluno->setEmail($t['email']);
          $aluno->setMatricula($t['matricula']);
        }

        return $aluno;
   }
}
?>


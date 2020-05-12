<?php
require 'conexao.php';

class AlunoDAO {
    public function getAlunoByMatricula($m) {
        $con = (new Conexao()).getConexao();
        $sql = "select * from Aluno where matricula=$m";
        $lab = $con->query($sql)->fetchAll();

        $aluno = new Aluno();

        foreach ($Lab as $t) {
            $aluno->setNome($t['nome']);
            $aluno->setIdadee($t['idade']);
            $aluno->setEmail($t['email']);
            $aluno->setMatricula($t['matricula']);
        }
        
        return $aluno;
    }
}
?>

<?php
require 'Conexao.php';
class AlunoDAO {
    public function getAlunoByMatricula($m) {
        $con = (new Conexao())->getConexao();
        $sql = "select * from Alunos where matricula=$m";
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

    public function getAlunosByMatricula($m) {
        $con = (new Conexao())->getConexao();
        $sql = "select * from Alunos where matricula=$m";
        $tab = $con->query($sql)->fetchAll();

        $alunos = array();

        foreach ($tab as $t) {
            $aluno = new Aluno();
            $aluno->setNome($t['nome']);
            $aluno->setIdade($t['idade']);
            $aluno->setEmail($t['email']);
            $aluno->setMatricula($t['matricula']);
            array_push($alunos, $aluno);
        }

        return $alunos;
    }

    public function getTodosAlunos() {
        $con = (new Conexao())->getConexao();
        $sql = "select * from Alunos";
        $tab = $con->query($sql)->fetchAll();

        $alunos = array();

        foreach ($tab as $t) {
            $aluno = new Aluno();
            $aluno->setNome($t['nome']);
            $aluno->setIdade($t['idade']);
            $aluno->setEmail($t['email']);
            $aluno->setMatricula($t['matricula']);
            array_push($alunos, $aluno);
        }

        return $alunos;
    }

}
?>

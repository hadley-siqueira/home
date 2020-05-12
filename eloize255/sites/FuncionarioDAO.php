<?php
require 'Funcionario.php';
require 'Conexao.php';

class FuncionarioDAO {
    public function getFuncionarioByMatricula($m) {
        $con = (new Conexao() )->getConexao();
        $sql = "select * from Funcionarios where matricula=$m";

        $tab = $con->query($sql)->fetchAll();
        $func = null;

        foreach ($tab as $t) {
            $func = new Funcionario();
            $func->setNome($t['nome']);
            $func->setIdade($t['idade']);
            $func->setMatricula($t['matricula']);
        }
        return $func; 
    }
}
?>

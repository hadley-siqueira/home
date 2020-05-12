<?php
require 'Funcionario.php';
require 'Conexao.php';

class FuncionarioDAO {
    public function getFuncionarioByMatricula($m) {
        $con = (new Conexao())->getConexao();
        $sql = "select * from Funcionarios where matricula=$m";
    
        $tab = $con->query($sql)->fetchAll();
        $func = null;

        foreach ($tab as $t) {
            $fune = new Funcionario();
            $fune->setNome($t['nome']);
            $fune->setIdade($t['idade']);
            $fune->setMatricula($t['matricula']);

        }
        return $func;
    }
}
?>

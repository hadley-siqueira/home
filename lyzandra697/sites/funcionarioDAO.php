<?php
require 'funcionarios.php';

class funcionarioDAO {
    public function getFuncionariosByMatricula ($m) {
      $con = (new conexao())->getConexao();
      $sql = "select * from funcionarios where matricula=$m";

      $tab = $con->query($sql)->fetAll();
      $func = null;

      foreach ($tab as $t) {
          $func = new funcionarios();
          $func->setNome($t['nome']);
          $func->setIdade($t['idade']);
          $func->setMatricula($t['matricula']);
       } 
      return $func;
   } 
}
?>



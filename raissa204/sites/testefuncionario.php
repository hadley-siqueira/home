<?php
require'funcionarioDAO.php';

$dao=new funcionarioDAO();
$f = $dao->getFuncionarioByMatricula(107);
if($f== null) {
   echo'nao existe funcionario';
}else{
   echo"o nome do usuario e" .$f->getNome();
}
?>

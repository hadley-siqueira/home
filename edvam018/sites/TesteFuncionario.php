<?php
require 'FuncionarioDAO.php';

$dao = new FuncionarioDAO();
$f = $dao->getFuncionarioByMatricula(107);

if ($f == null) {
   echo 'Nao tem';
} else {
   echo "O nome eh" . $f->getNome();
}
?>

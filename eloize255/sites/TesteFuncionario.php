<?php
require 'FuncionarioDAO.php';

$dao = new FuncionarioDAO();
$f = $dao->getFuncionarioByMatricula(107);

if ($f == null) {
    echo 'Nao existe este funcionario';
} else {
    echo "O nome do usuario eh " . $f->getNome();
}

?>

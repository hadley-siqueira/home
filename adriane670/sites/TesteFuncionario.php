<?php

require 'FuncionarioDAO.php';

$dao = new FuncionarioDAO();
$f = $dao->getFuncionarioByMatricula (107);

if ($f == null){
    echo 'nao existe funcionario';
} else{
    echo "O nome do usuario eh " . $f->getNome();
}
?>

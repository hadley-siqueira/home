<?php
require 'funcionarioDAO.php';
$dao = new funcionarioDAO();
$f = $dao->getFuncionarioByMatricula(107);

if ($f == null){
    echo 'Nao existe este funcionario';
}else{
    echo "o nome do usuário é " . $f->getNome();
}
?>

<?php
require 'funcionarioDAO.php';

$dao = new funcionarioDAO();
$f = $dao->getFuncionarioByMatricula(107);

if ($f == null) {
    echo 'Nao existe funcionario';
}else{
    echo "O nome do usuario er " . $f->getNome();

}
?>

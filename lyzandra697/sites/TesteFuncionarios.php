<?php
require 'conecxao.php';

$dao = new funcionarioDAO();
$f = $dao->getFuncionariosByMatricula(107);

if ($f == null) {
    echo 'Nao existe este funcionario';
} else {
    echo "O nome do usuario eh" .$f->getNome();
}
?>

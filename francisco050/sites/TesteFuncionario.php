<?php

require 'FuncionarioDAO.php';

$dao = new FuncionarioDAO();
$f = $dao -> getFuncionarioByMatricula(107);

if ($f ==null) {
    echo 'Não existe este funcionário.';
} else {
    echo 'O nome do funcionário é ' . $f->getNome();
}

?>

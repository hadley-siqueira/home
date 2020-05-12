<?php
require 'Usuario.php';

$user = new Usuario();
$user->setIdade(21);
echo $user->getIdade();
?>

<?php
class Usuario {
    private $nome;
    private $idade;

    public function setIdade($idade) {
        $this->idade = $idade;
    }

    public function getIdade() {
        return $this->idade;
    }
}
?>

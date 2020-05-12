<?php
class Funcionario {
    private $nome;
    private $idade;
    private $matricula;

    public function getNome() {
        return $this->nome;
    }

    public function setNome($n) {
        $this->nome = $n;
    }

    public function getIdade() {
        return $this->idade;
    }

    public function setIdade($i) {
        $this->idade = $i;
    }

    public function getMatricula() {
        return $this->matricula;
    }

    public function setMatricula($i) {
        $this->matricula = $i;
    }
}
?>

<?php
class Aluno {
    private $matricula;
    private $nome;
    private $idadee;
    private $email;

    public function setMatricula($m) {
        $this->matricula = $m;
    }

    public function getMatricula() {
        return $this->matricula;
    }

    public function setNome($n) {
        $this->nome = $n;
    }

    public function getNome() {
        return $this->nome;
    }

    public function setIdadee($i) {
        $this->idade = $i;
    }

    public function getIdadee() {
        return $this->idade;
    }

    public function setEmail($e) {
        $this->email = $e;
    }

    public function getEmail() {
        return $this->email;
    }
    }
?>

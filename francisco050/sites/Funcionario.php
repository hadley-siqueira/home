<?php
class Funcionario {
    private $nome;
    private $idade;
    private $matricula;

    public function getNome(){
        return $this->nome;
    }

    public function getIdade(){
        return $this->idade;
    }

    public function getMatricula(){
        return $this->matricula;
    }

    public function setNome($n){
        $this -> nome = $n;
    }
    public function setIdade($i){
        $this -> idade = $i;
    }
    public function setMatricula($m){
        $this -> matricula = $m;
    }
}

?>

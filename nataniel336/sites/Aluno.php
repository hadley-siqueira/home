<?php
class Aluno {
    private $matricula;
    private $nome;
    private $idade;
    private $email;
 
    public function getMatricula() {
       return $this->matricula;
    }
    public function setMatricula($m) {
        $this->matricula = $m;
    }
    public function getNome(){
        return $this->nome;
    }
    public function setNome($n) {
        $this->nome = $n;
    }
    public function getIdade() {
       return  $this->idade;
    }
    public function setIdade($i) {
        $this->idade = $i;
    }
    public function getEmail() {
       return $this->email;
    }
    public function setEmail($e) {
        $this->email = $e;
    }
}
?>  

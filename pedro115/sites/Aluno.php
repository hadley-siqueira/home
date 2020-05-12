<?php
class Aluno {
    private $matricula;
    private $nome;
    private $idade;
    private $email;

    public function setMatricula($m) {
            $this->matricula = $m;
   }
    public function getMatricula() {
            return $this->matricula;
   }
 
    public function setNome($n) {
            $this->Nome = $n; 
   }
    public function getNome() {
            return $this ->Nome;
   }

    public function setIdade($i) {
            $this->Idade = $i;
   }
    public function getIdade() {
            return $this->Idade;
   } 
     public function setEmail($e) {
            $this->Email = $e;
   }
    public function getEmail() {
            return $this->Email;
   }

} 
?>
   

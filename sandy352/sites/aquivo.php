<?php
class Aluno {
     private $matricula;
     private $nome;
     private $idade;
     private $email;

     public function setMatricula ($m) {
         $this->matricula = $m;
      }
      public function getMatricula() {
         return $this->matricula;
      }  
      public function setNome ($m) {
           $this->nome = $m;
      }
      public function getNome () {
           return $this->nome;
      }
      public function setIdade ($m) {
           $this->idade = $m;
      }
      public function getIdade () {
           return $this->idade;
      }
      public function seteEmail ($m) {
           $this->email = $m;
      }
      public function getEmail () {
           return $this->email;
      }
  }
      
?>

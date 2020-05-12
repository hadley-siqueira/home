<?php
class Aluno {
    private $nome;
    private $idade;
    private $email;
    private $matricula;

    public function setNome ($n){
        $this->nome = $n;
    }

    public function getNome (){
        return $this ->nome;
    }
 
     public function setIdade ($i){
        $this->idade = $i;
    }

    public function getIdade (){
        return $this ->idade;
    }

    public function setEmail ($e){
        $this->email = $e;
    }

     public function getEmail (){
        return $email ->email;
    }

    public function setMatricula ($m){
        $this->matricula = $m;
    }

    public function getMatricula (){
        return $this ->matricula;
    }
    
}
?>

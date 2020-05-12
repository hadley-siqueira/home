<?php
    $user="julio603";
    $pass="1234";
    $banco="julio603_Alunos";
    $host="localhost";
    $url="mysql:host=$host;dbname=$banco";

    try{
     $conexao = new PDO($url, $user, $pass);

     $sql = "INSERT INTO   i(nome, telefone, email) VALUES (:nome, :telefone, :email)";

     $comando = $conexao->prepare($sql);

     $comando->bindParam(':matricula' , $_POST['matricula']);
     $comando->bindParam(':nome' , $_POST['nome']);
     $comando->bindParam(':cpf' , $_POST['cpf']);
     $comando->bindParam(':idade' , $_POST['idade']);
     $comando->bindParam(':pai' , $_POST['pai']);
     $comando->bindParam(':mae' , $_POST['mae']);
     $comando->bindParam(':telefone' , $_POST['telefone']);
     $comando->bindParam(':email' , $_POST['email']);
     $comando->bindParam(':endereco' , $_POST['endereco']);



     $comando->execute();
     header('Location: listarContato2.php');
    } catch (PDOException $e) {

        echo "Erro: " . $e->getMessage();
    }

      
      

    ?>

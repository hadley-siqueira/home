
    

<?php
    $user = "francisco050";
    $pass = "1234";
    $banco = "francisco050_cadastro";
    $host = "localhost";
    $url = "mysql:host=$host;dbname=$banco";
   
    $nome = $_POST['nome'];    
    $telefone = $_POST['telefone'];
    $email = $_POST['email'];
    $senha = $_POST['senha'];
 
    try {    
    $conexao = new PDO( $url ,$user, $pass);
    $sql = "INSERT INTO cadastrados(nome, telefone, email, senha) VALUES(:nome, :telefone, :email, :senha)";

    $comando =  $conexao->prepare($sql);

    $comando->bindParam(':nome', $_POST['nome']);
    $comando->bindParam(':telefone', $_POST['telefone']);
    $comando->bindParam(':email', $_POST['email']);
    $comando->bindParam(':senha', $_POST['senha']);

    $comando->execute();
    header('Location: cadastrados2.php'); 
    } catch(PDOException $e){
        echo "Error: " . $e->getMessage();
    }
   
?>


<?php
    $user = "hadley";
    $pass = "1234";
    $banco = "hadley_agenda";
    $host = "localhost";
    $url = "mysql:host=$host;dbname=$banco";
    try{
        $conexao = nwe PDO($url, $user, $pass);
        $sql = "INSERT INTO contatos(nome, telefone, email) values (:nome, :telefone, :email)";
        $comando = $conexao->prepare($sql);
        $comando->bindParam(':nome', $_POST['nome']);
        $comando->bindParam(':telefone', $_POST['telefone']);
        $comando->bindParam(':email', $_POST['email']);

        $comando->execute();
        header('Location: listarContatos.php');
        
    }catch(PDOException $e){
        echo "deu erro".$e->getMessage();
    }
?>

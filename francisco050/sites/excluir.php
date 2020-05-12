<?php
    $user = "francisco050";
    $pass = "1234";
    $banco ="francisco050_Agenda";
    $host = "localhost";
    $url = "mysql:host=$host;dbname=$banco";

    try {
        $conexao = new PDO( $url, $user, $pass);
        $sql = "DELETE FROM Contatos where nome=:nome";

        $comando = $conexao-> prepare($sql);

        $comando->bindParam(':nome', $_GET['nome']);
        $comando->execute();
        header('Location: listarContatos2.php');
    } catch(PDOException $e){
          echo "Error:" . $e->getMessage();
    }
?>

<?php
$servername = "localhost";
$username = "usuarioPHP";
$password = "macau123";

try {
    $conn = new PDO("mysql:host=$servername;dbname=aulaPHP", $username, $password);
    // set the PDO error mode to exception
    $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    echo "Connected successfully"; 
    echo 'aqui';
    $sql = "SELECT nome, telefone, email FROM Contatos";
    $stmt = $conn->query($sql)->fetchAll(); 
    foreach($stmt as $v) { 
    echo 'aqui';
        echo $v['nome'];
    }
    echo 'aqui';
$conn = null;

} catch(PDOException $e) {
    echo "Connection failed: " . $e->getMessage();
}

?>

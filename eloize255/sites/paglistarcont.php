<?php
     $user = "eloize255";
     $pass = "1234";
     $banco = "eloize255_Agenda";
     $host = "localhost";
     $url = "mysql:host=$host;dbname=$banco";

    try {
        $conexao = new PDO ($url, $user, $pass);

        $sql = "SELECT nome, telefone, email FROM Contatos";
        $comando = $conexao->prepare($sql);
        $comando->execute();
        $resultado = $comando->fetchAll();
    } catch (PDOException $e) {
      echo "Error: " . $e->getMessage();
    }
?>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="uft-8">
        <link href="https://fonts.googleapis.com/css?family=Frank+Ruhl+Libre" rel="stylesheet">
    <style>
        #customers {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 50%;
    margin: auto;
}

#customers td, #customers th {
    border: 1px solid #ddd;
    padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: #4CAF50;
    color: white;
}

    h1 {
        margin-left:550px;
        font-family: 'Frank Ruhl Libre', serif;
        font-size:40px;
    }

    .button {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
    margin-left:600px;
    margin-top:20px;
}

    </style>
    </head>

    <body>
        <h1>Meus Contatos</h1>
        <table id="customers">
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>Telefone</th>
                    <th>Email</th>
                </tr>
            </thead>

            <tbody>
                <?php foreach ($resultado as $k) { ?>
                <tr>
                    <td><?php echo $k['nome'] ?></td>
                    <td><?php echo $k['telefone'] ?></td>
                    <td><?php echo $k['email'] ?></td>
                </tr>
                 <?php } ?>
 </tbody>
        </table>

        <a href="http://207.154.230.103:7249/eloize255/pagformulario.php" class="button">Novo Contato</a>
    </body>
</html>



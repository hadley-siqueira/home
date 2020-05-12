<?php
    $user = "ellen409";
    $pass = "1234";
    $banco = "ellen409_agenda";
    $host = "localhost";
    $url = "mysql:host=$host;dbname=$banco";

    try {
    $conexao = new PDO($url, $user, $pass);

    $sql = "SELECT matricula, nome, cpf, idade, pai, mae, telefone, email, endereco FROM Alunos";
    $comando =$conexao->prepare($sql);
    $comando->execute();
    $resultado = $comando->fetchAll();
    } catch (PDOException $e) {
      echo "Erro:" . $e->getMessage();
    }
?>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        
        <style>
            table {
                font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
                border-collapse: collapse;
                width: 100%;
            }
            table td, table th {
                border: 1px solid #ddd;
                padding: 8px;
            }
            
            table tr:nth-child(even){background-color: #f2f2f2;}

            table tr:hover {background-color: #ddd;}
        
            table th {
                padding-top: 12px;
                padding-bottom: 12px;
                text-align: left;
                background-color: #4CAF50;
                color: white;
            }
        </style>
    </head>
    
    <body>
        <table>
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
    </body>
</html>

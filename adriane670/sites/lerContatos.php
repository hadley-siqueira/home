<?php
    $user = "adriane670";
    $pass = "1234";
    $banco = "adriane670_Contatos";
    $host = "localhost";
    $url = "mysql:host=$host;dbname=$banco";

    try{
        $conexao = new PDO($url, $user, $pass);

        $sql = "SELECT nome,telefone, email FROM contatos";
        $comando = $conexao->prepare($sql);
        $comando->execute();
        $resultado = $comando->fetchAll();
       }catch (PDOException $e) {
        echo "ERROR:" . $e->getMessage();
       }
?>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utdf-8">
        <style>
            * {
                 font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
                 border-collapse: collapse;
                
            }
            body{
                background-image:url(http://escoladeimpressao3d.com.br/wp-content/uploads/2017/02/background.jpg)}

             td, th {
                border: 1px solid #ddd;
                padding: 8px;
            }

            tr:nth-child(even){background-color: #f2f2f2;}

            tr:hover {background-color: #ddd;}

            table{margin:auto; margin-top:20px;  background-color:white;}

            th {
                padding-top: 12px;
                padding-bottom: 12px;
                text-align: left;
                background-color: #4CAF50;
                color: white;
                min-width: 300px;
                
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
                cursor: pointer;
            }
            .div2 {
                text-align: center;
                margin:20px
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
            </body>
        </table>
            <div class="div2">
            <a href="http://207.154.230.103:7249/adriane670/formulario.php">
                <button class="button">
                   Novo Contato
                </button>
            </a>
            </div>
    </body>
</html>

<?php
    $user = "ellen409";
    $pass = "1234";
    $banco = "ellen409_agenda";
    $host = "localhost";
    $url = "mysql:host=$host;dbname=$banco";

    try {
    $conexao = new PDO($url, $user, $pass);

    $sql = "SELECT nome, telefone, email FROM contatos";
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
        <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">    
        <style>
            * {
                box-sizing: border-box;
            }

            body{
                background-image: url("http://escoladeimpressao3d.com.br/wp-content/uploads/2017/02/background.jpg");
                background-size: cover;
                background-repeat: no-repeat;
            }
           .tabela table{
                font-family: Times New Roman;
                border-collapse: collapse;
                width: 750px;
                margin: auto;
                font-weight: bold;
                margin-top: 20px;
                color: black;
            }
            .tabela h1 {
                font-family: Times New Roman;
                text-align: center;
                font-size: 50px;
                color: black;
            }
            .tabela td, table th {
                border: 1px solid #ddd;
                padding: 8px;
            }

            .tabela tr:nth-child(even){background-color: #f2f2f2;}

            .tabela tr:hover {background-color: #ddd;}

            .tabela th {
                padding-top: 12px;
                padding-bottom: 12px;
                text-align: left;
                background-color: #4caf50;
                color: black;
            }
            .button {
                display: block;
                background-color:#4caf50;
                border: 50px;
                color: white;
                text-align: center;
                font-size: 28px;
                padding: 20px;
                width: 500px;
                transition: all 0.5s;
                cursor: pointer;
                margin: auto;
                margin-top: 20px;
                margin-bottom: 50px;
            }

            .button span {
                cursor: pointer;
                display: inline-block;
                position: relative;
                transition: 0.5s;
            }

            .button span:after {
                content: '\00bb';
                position: absolute;
                opacity: 0;
                top: 0;
                right: -20px;
                transition: 0.5s;
            }

            .button:hover span {
                padding-right: 25px;
            }

            .button:hover span:after {
                opacity: 1;
                right: 0;
            }
            .div {
                background-color: white;
                width: 800px;
                margin: auto;
                padding: 30px;
                box-shadow: 2px 2px 2px black;
            }  

        </style>

    </head>
    
    <body>
        <div class= "div">
        <section class="tabela">
        <h1>Meus Contatos</h1>
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

        <button class="button" style="vertical-align:middle"><span>Novo Contato</span></button>
        </section>
        </div>
    </body>
</html>

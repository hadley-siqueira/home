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
                font-family: Roboto;
            }

            body{
                background-image: url("https://s-media-cache-ak0.pinimg.com/originals/0c/6b/0a/0c6b0a4cf2da2b59196de5c521049ef6.png");
                background-size: cover;
                background-repeat: no-repeat;
            }
           .tabela table{
                font-family: Roboto;
                border-collapse: collapse;
                width: 750px;
                margin: auto;
                font-weight: bold;
                color: #f21e1e;
            }
            .tabela h1 {
                font-family: Roboto;
                text-align: center;
                font-size: 50px;
                color: #f21e1e;
                margin-top: 20px;
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
                background-color: #f21e1e;
                color: white;
            }
            .button {
                display: block;
                border-radius: 4px;
                background-color:#f21e1e;
                border: 50px;
                color: white;
                text-align: center;
                font-size: 28px;
                padding: 20px;
                width: 500px;
                transition: all 0.5s;
                cursor: pointer;
                margin: auto;
                margin-top: 40px;
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
                box-shadow: 0px 0px 16px 3px rgba(0,0,0,0.75);
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

        <a button class="button" style="vertical-align:middle" href="http://207.154.230.103:7249/ellen409/formulario2.php"><span>Novo Contato</span></button></a>
        </section>
        </div>
    </body>
</html>

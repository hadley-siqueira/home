<?php
    $user = "shyrlane239";
    $pass = "1234";
    $banco = "shyrlane239_Agenda";
    $host = "localhost";
    $url = "mysql:host=$host; dbname=$banco";

    try {
        $conexao = new PDO($url, $user, $pass);
        
        $sql = "SELECT nome, telefone, email FROM Contatos";
        $comando = $conexao->prepare($sql);
        $comando->execute();
        $resultado = $comando->fetchAll();
    }   catch (PDOException $e) {
        echo "Error: " . $e->getMessage();
        }
?>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">

        <style>
            #qdr2 {
                background-color: #EEEEEE;
                text-align:center;
                width: 50%;
                padding-left: 40px;
                padding-right: 40px;
                margin: 100px; 
                margin-left: 270px;
                border: 2px solid #EEEEEE;
                border-radius: 20px;
                padding-bottom: 30px;
            }

            #titulo {
                font-family: "Lucida Console", serif;
                text-align: center;
                font-weight: bold;
            }

            #contatos {
                font-family: "Verdana", serif;
                font-size: 15px;
                border-collapse: collapse;
                width: 100%;
                cursor: pointer;
                border-radius: 14px;
            }
            
            #contatos td, #contatos th {
                border: 2px solid #00897B;
                padding: 8px;
              
            }

            #contatos tr:nth-child(even){background-color: #80CBC4;}

            #contatos tr:hover {background-color: #00695C;} 
        
            #contatos th {
                padding-top: 12px;
                padding-bottom: 12px;
                text-align: center;
                background-color: #00897B;
                color: white;
            }

            a {
                text-decoration: none;
                display: inline-block;
                padding: 15px 25px;
                font-size: 25px;
                font-family: "Lucida Console", serif;
                cursor: pointer;
                text-align: center;
                outline: none;
                color: #EEEEEE;
                background-color: #26A69A;
                border: none;
                border-radius: 12px;
                box-shadow: 0 9px #00695C;                
                width: 50%;
                margin-top: 15px;     
            }
            
            a:hover {background-color: #009688;}

            a:active {
                background-color: #3e6e41;
                box-shadow: 0 5px #666;
                transform: translateY(4px);
            } 
        </style>
    </head>

    <body background="http://escoladeimpressao3d.com.br/wp-content/uploads/2017/02/background.jpg">
        <div id="qdr2">
            <div id="titulo">
                <h1 style"font-size:90px">Meus Contatos</h1>
            </div>
        
        <table id="contatos">
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>Telefone</th>
                    <th>Email</th>
                </tr>
            </thead>
        
            <tbody>
                <?php foreach ($resultado as $k) {?>
                <tr>
                    <td><?php echo $k['nome'] ?></td>
                    <td><?php echo $k['telefone'] ?></td>
                    <td><?php echo $k['email'] ?></td>
                </tr>
                <?php } ?>
            </tbody>        
        </table>
        
        <a href="formulario2.php">Novo Contato</a>

        </div>
    </body>
</html>

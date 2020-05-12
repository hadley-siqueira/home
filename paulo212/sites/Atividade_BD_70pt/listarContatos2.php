<?php
       $user = "paulo212";
  $pass = "1234";
  $banco = "paulo212_Agenda";
  $host = "localhost";
  $url = "mysql:host=$host;dbname=$banco";

  try {
    $conexao = new PDO($url, $user, $pass);

    $sql = "SELECT nome, telefone, email FROM Contatos";
    $comando = $conexao->prepare($sql);
    $comando->execute();
    $resultado = $comando->fetchALL();
  } catch (PDOException $e) {
    echo "Error: " . $e->getMessage();
  }
?>

<!DOCTYPE html>
    <html>
        <head>
            <meta charset="utf-8">

            <style>
            .titulo {
                                   text-align: center;
                    font-family: Times new Roman;
                }

                #customers {
        font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
        border-collapse: collapse;
        width: 100%;
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


    .button {
      display: inline-block;
      border-radius: 4px;
      background-color:  #4CAF50;
      border: none;
      color: white;
      text-align: center;
      font-size: 28px;
      padding: 15px 32px;
      width: 100%;
      margin-top: 20px;
      transition: all 0.5s;
      cursor: pointer;
      margin: 5px;
      
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
      padding-right: 2px;
    }

    .button:hover span:after {
      opacity: 1;
      right: 0;
    }
    input[type=submit] {
        width: 100%;
        background-color: #4CAF50;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        font-size:20px; 
        border-radius: 4px;
        cursor: pointer;
    }

    input[type=submit]:hover {
        background-color: #7FFFD4;
    }
    div {
        border-radius: 5px;
        background-color:#F0FFFF;
        padding: 80px;
        width: 40%;
        margin:auto;
        margin-top: 100px;
        }
    body {
                    margin: 0;
                    padding:0;
                    background-image:url("http://escoladeimpressao3d.com.br/wp-content/uploads/2017/02/background.jpg");
                    min-height: 100%;
                    background-size: cover;
                    background-attachment: fixed;
                    background-repeat: no-repeat;
                    background-position: center center;
                }


            </style>
        </head>

        <body>
            <div>
            <h1 class="titulo">Meus Contatos</h1>
            <table id="customers">
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>Telefone</th>
                        <th>Email</th>
                    </tr>
                
                </thead>
               <tbody> 
                    <?php foreach($resultado as $k) { ?>
                        <tr>
                            <td><?php echo $k['nome']?></td>
                            <td><?php echo $k['telefone']?></td>
                            <td><?php echo $k['email']?></td>
                        </tr>
                              
                    <?php } ?>
                </tbody>
            </table>
         <form action="formulario2.php" method="post">
           <input type="submit" value="Novo Contato">
         </form>   
        </div>
      </body>
    </html>


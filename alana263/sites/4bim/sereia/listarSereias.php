<?php
        $user = "alana263";
        $pass = "1234";
        $banco = "alana263_Projeto";
        $host = "localhost";
        $url = "mysql:host=$host;dbname=$banco";

        try {
            $conexao = new PDO($url, $user, $pass);

            $sql = "SELECT nome, cor, idade, poderes FROM Sereias";
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

    #customers tr:nth-child(even){background-color: #E0FFFF;}

    #customers tr:hover {background-color: #ddd;}

    #customers th {
        padding-top: 12px;
        padding-bottom: 12px;
        text-align: left;
        background-color: #008B8B;
        color: white;
    }

    div {
        border-radius: 5px;
        background-color:#B0E0E6;
        padding: 80px;
        width: 80%;
        margin:auto;
        margin-top: 100px;
        }
    body {
                    margin: 0;
                    padding:0;
                    background-image:url(../img/MERMAID-MELISSA-PINK-TAIL-UNDERWATER-POOL.png);
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
            <h1 class="titulo">Lista de Sereias</h1>
            <table id="customers">
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>Cor</th>
                        <th>Idade</th>
                        <th>Poderes</th>
                    </tr>

                </thead>
               <tbody>
                    <?php foreach($resultado as $k) { ?>
                        <tr>
                            <td><?php echo $k['nome']?></td>
                            <td><?php echo $k['cor']?></td>
                            <td><?php echo $k['idade']?></td>
                            <td><?php echo $k['poderes']?></td>
                        </tr>
                    <?php } ?>
                </tbody>
            </table>

               
            </div>
      </body>
    </html>

<?php
    $user = "maria085";
    $pass = "1234";
    $banco = "maria085_Agenda";
    $host = "localhost";
    $url = "mysql:host=$host;dbname=$banco";

    try {
        $conexao = new PDO($url, $user, $pass);

        $sql = "SELECT matricula, nome, cpf, idade, pai, mae, telefone, email, endereco FROM Alunos";
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

            .quadro {
                padding:15px;
                width: 70%;
                margin: auto;
                background-color: #FFFFFF;
                box-shadow: 2px 2px 10px -1px rgba(0,0,0,0.75);
            }

            .titulo{
                font-family: "Times New Roman";
                font-size: 50px;
                text-align: center;
            }

            .texto {
                font-family: "Times New Roman";
                font-size: 25px;                
            }

            table {
                width: 30%;
                margin: auto;
            }
            
            tr:hover {background-color: #f5f5f5;}
            tr:nth-child(even) {background-color: #f2f2f2;}

            th {
                background-color: #4CAF50;
                color: white;
                text-align: left;
                height: 25px;
              
            }

            th, td {
                padding: 15px;
                text-align: left;
            }

            .botao {
                display: inline-block;
                border-radius: 4px;
                background-color:  #4CAF50;
                border: none;
                color: white;
                text-align: center;
                font-size: 28px;
                padding: 15px 32px;
                width: 90%; 
                transition: all 0.5s;
                cursor: pointer;
                margin: 5px;
                margin-top:20px;
                margin-left: 60px;
                border-radius: 4px;
            }

            .botao span {
                cursor: pointer;
                display: inline-block;
                position: relative;
                transition: 0.5s;
            }

            .botao span:after {
                content: '\00bb';
                position: absolute;
                opacity: 0;
                top: 0;
                right: -20px;
                transition: 0.5s;
            }

            .botao:hover span {
                padding-right: 25px;
            }

            .botao:hover span:after {
                opacity: 1;
                right: 0;
            }

        </style>
    </head>

    <body>
        <div class="quadro">
            <h1 class="titulo">Meus Contatos</h1>
<div style="overflow-x:auto;">
            <table class="texto">
                <thead>
                    <tr>
                        <th>Matrícula</th>
                        <th>Nome</th>
                        <th>CPF</th>
                        <th>Idade</th>
                        <th>Pai</th>
                        <th>Mãe</th>
                        <th>Telefone</th>
                        <th>Email</th>
                        <th>Endereço</th>
                    </tr>
                </thead>

                <tbody>
                    <?php foreach ($resultado as $k) { ?>
                    <tr>
                        <td><?php echo $k['matricula'] ?></td>
                        <td><?php echo $k['nome'] ?></td>
                        <td><?php echo $k['cpf'] ?></td>
                        <td><?php echo $k['idade'] ?></td>
                        <td><?php echo $k['pai'] ?></td>
                        <td><?php echo $k['mae'] ?></td>
                        <td><?php echo $k['telefone'] ?></td>
                        <td><?php echo $k['email'] ?></td>
                        <td><?php echo $k['endereco'] ?></td>
                    </tr>
                    <?php } ?>
                </tbody>
            </table>
</div>
            <a href="http://207.154.230.103:7249/maria085/formularioAluno.php">
            <button class="botao" style="vertical-align:middle"><span>Novo Aluno</span></button>
            </a>
        </div>            
    </body>
</html>

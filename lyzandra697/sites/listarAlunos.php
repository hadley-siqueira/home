<?php    
  $user = "lyzandra697";
  $pass = "1234";
  $banco = "lyzandra697_Agenda2";
  $host = "localhost";
  $url = "mysql:host=$host;dbname=$banco";

  try{
    $conexao = new PDO($url, $user, $pass);

    $sql = "SELECT matricula, nome, cpf, idade, pai, mae, telefone, email, endereco FROM Alunos";
    $comando = $conexao->prepare($sql);
    $comando->execute();
    $resultado = $comando->fetchAll();
  } catch (PDOException $e) {
    echo "Error:" . $e->getMessage();
  }
?>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
      <style>
             * {
                box-sizing: border-box;
                font-family: Arial;
            }

            body{
                background-image: url("http://w1.ezcdn.com.br/franadesivos/fotos/zoom/2784fz1/papel-de-parede-floral-mod-011.jpg");
                background-size: cover;
                background-repeat: no-repeat;
            }
           .tab table{
                font-family: Arial;
                border-collapse: collapse;
                width: 750px;
                margin: auto;
                font-weight: bold;
                color: ;
            }
            .tab h1 {
                font-family: roboto;
                text-align: center;
                font-size: 50px;
                color: black;
                margin-top: 20px;
            }
            .tab td, table th {
                border: 1px solid #ddd;
                padding: 8px;
            }

            .tab tr:nth-child(even){background-color: #f2f2f2;}

            .tab tr:hover {background-color: #ddd;}

            .tab th {
                padding-top: 12px;
                padding-bottom: 12px;
                text-align: left;
                background-color: #4caf50;
                color: black;
            }
            
            .button {
                display: block;
                border-radius: 4px;
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
        <div class="div">
        <section class="tab">
        <h1>Relação de Alunos</h1>
         <table>
            <thead>
                <tr>
                    <th>Matricula</th>
                    <th>Nome</th>
                    <th>Cpf</th>
                    <th>Idade</th>
                    <th>Pai</th>
                    <th>Mae</th>
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
                    <td><?php echo $k['endereço'] ?></td>
                </tr>
                <?php } ?>
            </tbody>
        </table>
        </section>
         <a button class="button" style="vertical-align:middle" href="http://207.154.230.103:7249/lyzandra697/sites/formularioAlunos.php"><span>Novo Contato</span></button></a>
        </div>
    </body>
</html>



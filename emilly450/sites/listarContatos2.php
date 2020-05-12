<?php
  $user = "emilly450";
  $pass = "1234";
  $banco = "emilly450_Agenda";
  $host = "localhost";
  $url = "mysql:host=$host;dbname=$banco";

  try {
    $conexao = new PDO($url, $user, $pass);

    $sql = "SELECT nome, telefone, email FROM Contatos";
    $comando = $conexao->prepare($sql);
    $comando->execute();
    $resultado = $comando->fetchall();
  } catch (PDOExeption $e) {
    echo "Error: " . $e->getMessage;
  }
?>

<!DOCTYPE html>
<html>
  <head>
     <meta charset="utf-8">
    <style>
            * {
                box-sizing: border-box;
                font-family: Roboto;
            }

            body{
                background-image: url("http://escoladeimpressao3d.com.br/wp-content/uploads/2017/02/background.jpg");
                background-size: cover;
                background-repeat: no-repeat;
            }
           .tabela table{
                font-family: Roboto;
                border-collapse: collapse;
                width: 750px;
                margin: auto;
                font-weight: bold;
                color: ;
            }
            .tabela h1 {
                font-family: Roboto;
                text-align: center;
                font-size: 50px;
                color: black;
               margin-top: 20px;
            }
            .tabela td, table th {
                border: 1px solid #ddd;
                padding: 8px;
            }

            .tabela tr:nth-child(even){
                background-color: #f2f2f2;
            }

            .tabela tr:hover {
                background-color: #ddd;
            }

            .tabela th {
                padding-top: 12px;
                padding-bottom: 12px;
                text-align: left;
                background-color: #4caf50;
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
            .button {
                padding-top:15px;
                padding-bottom:15px;
                margin-top:20px;
                text-align:center;
                font-size:18px;
                border-radius:5px;
                float:left;
                width:40%;
                margin-left:30%;
                background-color:green;
                color:#FFF;
                transition:all 0.5;
            }
            .button:hover {
                background-color:darkGreen;
                transition:all 0.5s;
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
           <section class="tabela">
             <h1>Cadastro de Contato</h1>
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
                       <td> <?php echo $k['email'] ?></td>
                    </tr>
                  <?php } ?>
                 </tbody>
              </table>
           </section>
         </div>
            <a button class="button" style="vertical-align:middle" href="formulario2.php"><span>Nova matrícula</span></button></a>
  </body>
</html>

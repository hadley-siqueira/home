<?php

 $user ="fabricio123";
 $pass ="1234";
 $banco ="fabricio123_Agenda";
 $host ="localhost";
 $url ="mysql:host=$host;dbname=$banco";

 try{
   $conexao = new PDO($url, $user, $pass);
   $sql = "SELECT nome, cpf, idade, pai, mae telefone, email, matricula FROM Alunos";
   $comando = $conexao->prepare($sql);
   $comando->execute();
   $resultado = $comando->fetchAll();
  }catch (PDOException $e) {
   echo "Error: " . $e->getMessage();
  }
?>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf=8">
  <style>

    h1{
    font-family: "Times New Roman", Times, serif;
    font-variant: small-caps;
    font-size: 50px;
    text-align: center;
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
    div {
    border-width: 10px 10px 3px 10px;
    border-top-color: #79ec7e;
    border-top-style: inset;
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
    width:50%;
    position: absolute;
    left: 25%;
    top: 10%;
    -webkit-box-shadow: -2px 2px 85px -19px rgba(0,0,0,0.55);
    -moz-box-shadow: -2px 2px 85px -19px rgba(0,0,0,0.55);
    box-shadow: -2px 35px 85px -19px rgba(0,0,0,0.55);
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


     background-color: #4CAF50; 
    border: none;
    color: white;
    padding: 16px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    -webkit-transition-duration: 0.4s; 
     transition-duration: 0.4s;
    cursor: pointer;
    -webkit-transition-duration: 0.4s; 
    transition-duration: 0.4s;
}

.button:hover {
    background-color:  #555555;; 
    color: white;
}

  </style>
  </head>

  <body>

   <div>
   <h1> Meus Contatos </h1>
    <table id="customers">
    <thead>
      <tr>
        <th>Nome</th>
       <th>cpf</th>
        <th>Idade</th>
        <th>Pai</th>
        <th>Mãe</th>
        <th>Telefone</th>
        <th>Email</th>
        <th>Matricula</th>
      </tr>
    </thead>

    <tbody>
      <?php foreach ($resultado as $k) {?>
      <tr>
        <td><?php echo $k['nome'] ?></td>
        <td><?php echo $k['cpf'] ?></td>
        <td><?php echo $k['idade'] ?></td>
        <td><?php echo $k['pai'] ?></td>
        <td><?php echo $k['mae'] ?></td>
        <td><?php echo $k['telefone'] ?></td>
        <td><?php echo $k['email'] ?></td>
       <td><?php echo $k['matricula'] ?></td>
      </td>
      <?php } ?>
    </tbody>
   </table>

   <a href="formularioAluno.php"> <button class="button" >Novo Contato</button></a>
    </div>
 </body>
</html>


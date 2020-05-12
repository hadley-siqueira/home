<?php    
    $user = "felix312";
    $pass = "1234";
    $banco = "felix312_Atividade";
    $host = "localhost";
    $url = "mysql:host=$host;dbname=$banco";

    try{
        $conexao = new PDO($url, $user, $pass);

        $sql = "SELECT nome, telefone, email FROM Atividade";
        $comando = $conexao->prepare($sql);
        $comando->execute();
        $resultado = $comando->fetchAll();
  }     catch (PDOException $e) {
        echo "Error: " . $e->getMessage();
}
?>

<!DOCTYPE html>
    <html>
<head>
<meta charset="utf-8">
<style>
        #qdr2 {
            background-color: #000000;
            text-align:center;
            width: 50%;
            padding-left: 40px;
            padding-right: 40px;
            margin: 100px;
            margin-left: 270px;
            border: 2px solid #b30000;
            border-radius: 20px;
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
            border: 2px solid #000000;
            padding: 8px;

        }

        #contatos tr:nth-child(even){background-color: #3333cc;}

        #contatos tr:hover {background-color: #6600cc;}

        #contatos th {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: center;
            background-color: #33cccc;
            color: white;
}
</style>
   </head>

    <body>
        <table id="contatos">
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>Telefone</th>
                    <th>Email</th>
                </th>
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
     </body>
</html>


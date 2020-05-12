<?php   

    $user = "felix312";
    $pass = "1234";
    $banco = "felix312_Loja";
    $host = "localhost";
    $url = "mysql:host=$host;dbname=$banco";

    try{
        $conexao = new PDO($url, $user, $pass);

        $sql = "SELECT Valor, Quantidade FROM Produtos";
        $comando = $conexao->prepare($sql);
        $comando->execute();
        $resultado = $comando->fetchAll();
     }  catch (PDOException $e) {
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
            }

            #titulo {
                font-family: "Lucida Console", serif;
                text-align: center;
                font-weight: bold;
            }

            #Produtos {
                font-family: "Verdana", serif;
                font-size: 15px;
                border-collapse: collapse;
                width: 100%;
                cursor: pointer;
                border-radius: 14px;
            }

            #Produtos td, #Produtos th {
                border: 2px solid #00897B;
                padding: 8px;

            }

            #Produtos tr:nth-child(even){background-color: #80CBC4;}

            #Produtos tr:hover {background-color: #00695C;}

            #Produtos th {
                padding-top: 12px;
                padding-bottom: 12px;
                text-align: center;
                background-color: #00897B;
                color: white;
}
</style>
</head>

<body>
    <table id="Produtos">
        <thead>
            <th>Valor</th>
            <th>Quantidade</th>
               
            </thead>

            <tbody>
                <?php foreach ($resultado as $k) { ?>
                <tr>
                    <td><?php echo $k['Valor'] ?></td>
                    <td><?php echo $k['Quantidade'] ?></td>
                </tr>
                
             </tbody>
        </table>
     </body>
</html>














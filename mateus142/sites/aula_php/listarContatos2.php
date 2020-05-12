<?php
    $user = "hadley";
    $pass = "1234";
    $banco = "hadley_agenda";
    $host = "localhost";
    $url = "mysql:host=$host;dbname=$banco";
    try{
        $conexao = new PDO($url, $user, $pass);
        $sql = "SELECT nome, telefone, email FROM contatos";        
        $comando = $conexao->prepare($sql);
        $comando->execute();
        $resultado = $comando->fetchAll();
    }catch(PDOException $e){
        echo "Error: " . $e->getMessage();;
    }
?>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <style>
            body {width:100%; height:100%; margin:0px; padding:0px;}
            section {float:left; width:50%; margin-left:25%; margin-top:5px; height:; box-shadow:1px 1px 5px black; }
            h1 {float:left; width:100%; text-align:center; margin-top:60px; font-size:40px;}
            table {float:left; width:90%; margin-left:5%;}
            table thead th {background-color:limegreen; padding-top:10px; padding-bottom:10px; text-align:left; color:#FFF; font-family:arial; font-size:16px;}
            table tbody tr:nth-child(even) {background-color:#D3D3D3; font-family:arial; font-size:16px; padding-top:3px; padding-bottom:3px;}
            a {float:left; text-decoration:none; transition:all 0.5s; width:90%; cursor:pointer; margin-left:5%; margin-top:10px; margin-bottom:10px; padding-top:10px; padding-bottom:10px; text-align:center; background-color:green; border-radius:5px; color:#FFF; font-family:arial;}
            a:hover {background-color:DarkGreen; transition:all 0.5s;}
        </style>
    </head>
    <body>
        <section>
        <h1>Meus Contatos</h1>
        <table>
            <thead>
                <th>&nbsp;&nbsp;&nbsp;Nome</th>
                <th>&nbsp;&nbsp;&nbsp;Telefone</th>
                <th>&nbsp;&nbsp;&nbsp;Email</th>
            <thead>
            <tbody>
                <?php
                    foreach ($resultado as $k){
                ?>
                <tr>
                    <td>&nbsp;&nbsp;&nbsp;<?php echo $k['nome'] ?></td>
                    <td>&nbsp;&nbsp;&nbsp;<?php echo $k['telefone'] ?></td>
                    <td>&nbsp;&nbsp;&nbsp;<?php echo $k['email'] ?></td>
                </tr>
                <?php
                    }
                ?>
            </tbody>
        </table>
        <a href="formulario2.php">Novo Contato</a>
        </section>
    </body>
</html>

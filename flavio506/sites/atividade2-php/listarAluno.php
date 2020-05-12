<?php
    $user = "flavio506";
    $pass = "1234";
    $banco = "flavio506_Alunos";
    $host = "localhost";
    $url = "mysql:host=$host;dbname=$banco";
    try{
        $conexao = new PDO($url, $user, $pass);
        $sql = "SELECT matricula, nome, cpf, idade, pai, mae,  telefone, email, endereco FROM Alunos";
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
            section {float:center; width:70%; margin-left:20%; margin-top:5px; height:; box-shadow:1px 1px 5px black; }
            h1 {float:left; width:100%; text-align:center; margin-top:60px; font-size:40px;}
            table {float:left; width:90%; margin-left:5%;}
            table thead th {background-color:limegreen; padding-top:10px; padding-bottom:10px; text-align:left; color:#FFF; font-family:arial; font-size:16px;}
            table tbody tr:nth-child(even) {background-color:#D3D3D3; font-family:arial; font-size:17px; padding-top:3px; padding-bottom:3px;}
            a {float:left; text-decoration:none; transition:all 0.5s; width:90%; cursor:pointer; margin-left:5%; margin-top:10px; margin-bottom:10px; padding-top:10px; padding-bottom:10px; text-align:center; background-color:green; border-radius:5px; color:#FFF; font-family:arial;}
            a:hover {background-color:DarkGreen; transition:all 0.5s;}
        </style>
    </head>
    <body>
        <section>
        <h1>Meus Alunos</h1>
        <table>
 <thead>
		<th>&nbsp;&nbsp;&nbsp;Matricula</th>
                <th>&nbsp;&nbsp;&nbsp;Nome</th>
		<th>&nbsp;&nbsp;&nbsp;CPF</th>
		<th>&nbsp;&nbsp;&nbsp;Idade</th>
		<th>&nbsp;&nbsp;&nbsp;Pai</th>
		<th>&nbsp;&nbsp;&nbsp;Mae</th>
                <th>&nbsp;&nbsp;&nbsp;Telefone</th>
                <th>&nbsp;&nbsp;&nbsp;Email</th>
		<th>&nbsp;&nbsp;&nbsp;Endereço</th>
            <thead>
            <tbody>
                <?php
                    foreach ($resultado as $k){
                ?>
                <tr>
		    <td>&nbsp;&nbsp;&nbsp;<?php echo $k['matricula'] ?></td>
                    <td>&nbsp;&nbsp;&nbsp;<?php echo $k['nome'] ?></td>
		    <td>&nbsp;&nbsp;&nbsp;<?php echo $k['cpf'] ?></td>
		    <td>&nbsp;&nbsp;&nbsp;<?php echo $k['idade'] ?></td>
		    <td>&nbsp;&nbsp;&nbsp;<?php echo $k['pai'] ?></td>
		    <td>&nbsp;&nbsp;&nbsp;<?php echo $k['mae'] ?></td>
                    <td>&nbsp;&nbsp;&nbsp;<?php echo $k['telefone'] ?></td>
                    <td>&nbsp;&nbsp;&nbsp;<?php echo $k['email'] ?></td>
		    <td>&nbsp;&nbsp;&nbsp;<?php echo $k['endereco'] ?></td>
                </tr>
                <?php
                    }
                ?>
            </tbody>
        </table>
        <a href="formularioAluno.php">Novo Aluno</a>
        </section>
    </body>
</html>


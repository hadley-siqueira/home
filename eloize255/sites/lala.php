<!DOCTYPE html>
<html>
<head>
<style>
table {
    width: 40%;
    border-collapse: collapse;
    margin-left: 45px;
}

table, td, th {
    border: 1px solid #ddd;
    padding: 5px;
}

th {text-align: left;}
</style>
</head>
<body>

<?php
$q = ($_GET['q']);

$con = mysqli_connect('localhost','eloize255','1234','eloize255_Produtos');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}


$sql="SELECT * FROM produto WHERE nome = '".$q."'";
$result = mysqli_query($con,$sql);

echo "<table>
<tr>
<th>Nome</th>
<th>Preço</th>
<th>Quantidade</th>
<th>Marca</th>
<th>Descrição</th>
<th>Observação</th>
</tr>";
while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['nome'] . "</td>";
    echo "<td>" . $row['preco'] . "</td>";
    echo "<td>" . $row['quantidade'] . "</td>";
    echo "<td>" . $row['marca'] . "</td>";
    echo "<td>" . $row['descricao'] . "</td>";
    echo "<td>" . $row['observacoes'] . "</td>";
    echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>
</body>
</html>

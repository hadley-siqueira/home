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
$q = ($_GET['q']);$con = mysqli_connect('localhost','vitoria743','1234','vitoria743_SAPATOS');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}


$sql="SELECT * FROM produto WHERE nome = '".$q."'";
$result = mysqli_query($con,$sql);

echo "<table>
<tr>
<th>Nome</th>
<th>Preço</th>
<th>cor</th>
<th>tamanho</th>
</tr>";
while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['nome'] . "</td>";
    echo "<td>" . $row['preco'] . "</td>";
    echo "<td>" . $row['cor'] . "</td>";
    echo "<td>" . $row['tamanho'] . "</td>";
    echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>
</body>
</html>

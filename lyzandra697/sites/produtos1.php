<!DOCTYPE html>
<html>
<head>
<style>
table {
    width: 100%;
    border-collapse: collapse;
}

table, td, th {
    border: 1px solid black;
    padding: 5px;
}

th {text-align: left;}
</style>
</head>
<body>

<?php
$q = ($_GET['q']);
$con = mysqli_connect('localhost','lyzandra697','1234','lyzandra697_produtos');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}

$sql="SELECT * FROM produtos  WHERE nome = '".$q."'";
$result = mysqli_query($con,$sql);

echo "<table>
<tr>
<th>nome</th>
<th>preço</th>
<th>quantidade</th>
<th>marca</th>
<th>descrição </th>
</tr>";
while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['nome'] . "</td>";
    echo "<td>" . $row['preco'] . "</td>";
    echo "<td>" . $row['quantidade'] . "</td>";
    echo "<td>" . $row['marca'] . "</td>";
    echo "<td>" . $row['descricao'] . "</td>";
    echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>
</body>
</html>


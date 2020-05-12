<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
$q = $_GET['q'];

$con = mysqli_connect('localhost','luygi077','1234','luygi077_Supermercado');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}

$sql="SELECT * FROM Supermercado1 WHERE nome like '".$q."%'";
$result = mysqli_query($con,$sql);

echo "<table>
<tr>
<th>id</th>
<th>nome</th>
<th>preco</th>
<th>marca</th>
<th>quantidade</th>
<th>descricao</th>
</tr>";
while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['id'] . "</td>";
    echo "<td>" . $row['nome'] . "</td>";
    echo "<td>" . $row['preco'] . "</td>";
    echo "<td>" . $row['marca'] . "</td>";
    echo "<td>" . $row['quantidade'] . "</td>";
    echo "<th>" . $row['descricao'] . "</th>";
    echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>
</body>
</html>


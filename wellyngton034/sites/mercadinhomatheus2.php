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
$q = $_GET['q'];

$con = mysqli_connect('localhost','wellyngton034','1234','wellyngton034_MercadinhoDoMatios');

if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}

$sql="SELECT * FROM Meumercadinho WHERE nome like '".$q."%'";
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
    echo "<td>" . $row['descricao'] . "</td>";
    echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>
</body>
</html>


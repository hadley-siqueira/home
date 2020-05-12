<!DOCTYPE html>
<html>
<head>
<style>
table {
    width: 100%;
    border-collapse: collapse;
    background-color: #eee;
}

table, td, th {
    
    border: 1px solid black;
    padding: 5px;
}

th {text-align: center;}
</style>
</head>
<body>

<?php
$q = $_GET['q'];

$con = mysqli_connect('localhost','sandy352','1234','sandy352_Loja');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}

$sql="SELECT * FROM Produtos where nome like '".$q."%'";
$result = mysqli_query($con,$sql);

echo "<table>
<tr>
<th>id</th>
<th>nome</th>
<th>marca</th>
<th>quantidade</th>
<th>preco</th>
</tr>";
while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['id'] . "</td>";
    echo "<td>" . $row['nome'] . "</td>";
    echo "<td>" . $row['marca'] . "</td>";
    echo "<td>" . $row['quantidade'] . "</td>";
    echo "<td>" . $row['preco'] . "</td>";
    echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>
</body>
</html>


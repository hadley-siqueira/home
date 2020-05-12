<!DOCTYPE html>
<html>
<head>
<style>
table {
    width: 70%;
    border-collapse: collapse;
    margin:auto;
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
$q =$_GET['q'];

$con = mysqli_connect('localhost','ellen409','1234','ellen409_mercado');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}

$sql="SELECT * FROM mercadorias WHERE fruta like '".$q . "%'";
$result = mysqli_query($con,$sql);

echo "<table>
<tr>
<th>Id</th>
<th>Fruta</th>
<th>Peso</th>
<th>Preço</th>
</tr>";
while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['id'] . "</td>";
    echo "<td>" . $row['fruta'] . "</td>";
    echo "<td>" . $row['peso'] . "</td>";
    echo "<td>" . $row['preco'] . "</td>";
    echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>
</body>
</html>


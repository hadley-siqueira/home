<!DOCTYPE html>
<html>
<head>
<style>
table {
    width: 80%;
    border-collapse: collapse;
    margin: auto;
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

$con = mysqli_connect('localhost','ellem360','1234','ellem360_mercadoria');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}

$sql="SELECT * FROM Mercadorias WHERE Frutas like  '".$q."%'";
$result = mysqli_query($con,$sql);

echo "<table>
<tr>
<th>Id</th>
<th>Frutas</th>
<th>Peso</th>
<th>Preco</th>

</tr>";
while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['Id'] . "</td>";
    echo "<td>" . $row['Frutas'] . "</td>";
    echo "<td>" . $row['Peso'] . "</td>";
    echo "<td>" . $row['Preco'] . "</td>";
    echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>
</body>
</html>

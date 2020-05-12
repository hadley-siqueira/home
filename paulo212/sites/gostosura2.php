<!DOCTYPE html>
<html>
<head>
<meta charset="uft-8">
<style>
table {
    width: 70%;
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
$q = $_GET['q'];

$con = mysqli_connect('localhost','paulo212','1234','paulo212_gostosura');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}

$sql="SELECT * FROM paulo212_gostosura WHERE nome like '".$q."%'";
$result = mysqli_query($con,$sql);

echo "<table>
<tr>
<th>id</th>
<th>nome</th>
<th>peso</th>
<th>preco</th>
</tr>";
while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['id'] . "</td>";
    echo "<td>" . $row['nome'] . "</td>";
    echo "<td>" . $row['peso'] . "</td>";
    echo "<td>" . $row['preco'] . "</td>";
    echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>
</body>
</html>


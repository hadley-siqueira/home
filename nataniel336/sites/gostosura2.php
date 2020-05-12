<!DOCTYPE html>
<html>
<head>
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

$con = mysqli_connect('localhost','flavio506','1234','flavio506_gostosura');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}

$sql="SELECT * FROM gostosura WHERE frutas like '".$q."%'";
$result = mysqli_query($con,$sql);

echo "<table>
<tr>
<th>id</th>
<th>fruta</th>
<th>peso</th>
<th>preco</th>
</tr>";
while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['id'] . "</td>";
    echo "<td>" . $row['frutas'] . "</td>";
    echo "<td>" . $row['peso'] . "</td>";
    echo "<td>" . $row['preco'] . "</td>";
    echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>
</body>
</html>


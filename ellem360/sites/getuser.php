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
$q = intval($_GET['q']);

$con = mysqli_connect('localhost','ellem360','1234','ellem360_fnovo');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}

mysqli_select_db($con,"ajax_demo");
$sql="SELECT * FROM states WHERE id = '".$q."'";
$result = mysqli_query($con,$sql);

echo "<table>
<tr>
<th>id</th>
<th>PrimeiroNome</th>
<th>UltimoNome</th>
<th>Idade</th>
<th>CidadeNatal</th>
<th>Trabalho</th>
</tr>";
while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['id'] . "</td>";
    echo "<td>" . $row['PrimeiroNome'] . "</td>";
    echo "<td>" . $row['UltimoNome'] . "</td>";
    echo "<td>" . $row['Idade'] . "</td>";
    echo "<td>" . $row['CidadeNatal'] . "</td>";
    echo "<td>" . $row['Trabalho'] . "</td>";
    echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>
</body>
</html>

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

$con = mysqli_connect('localhost','ellen409','1234','ellen409_novo');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}

mysqli_select_db($con,"ellen409_novo");
$sql="SELECT * FROM produtos WHERE id ='".$q."'";
$result = mysqli_query($con,$sql);

echo "<table>
<tr>
<th>primeiro nome</th>
<th>segundo nome</th>
<th>idade</th>
<th>cidade</th>
<th>trabalho</th>
</tr>";
while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['primeiro_nome'] . "</td>";
    echo "<td>" . $row['segundo_nome'] . "</td>";
    echo "<td>" . $row['idade'] . "</td>";
    echo "<td>" . $row['cidade'] . "</td>";
    echo "<td>" . $row['trabalho'] . "</td>";
    echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>
</body>
</html>

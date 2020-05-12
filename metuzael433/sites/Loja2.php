<!DOCTYPE html>
<html>
    <head>
        <meta charset="uft-8">
<style>
table {
     
    width: 50%;
    border-collapse: collapse;
    margin: auto;
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
$con = mysqli_connect('localhost','metuzael433','1234','metuzael433_LOJA');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}

$sql="SELECT * FROM padaria WHERE nome like '".$q."%'";
$result = mysqli_query($con,$sql);

    echo "<table>
    <tr>
        <th>nome</th>
        <th>quantidade</th>
        <th>valor</th>
    </tr>";
while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['nome'] . "</td>";
    echo "<td>" . $row['quantidade'] . "</td>";
    echo "<td>" . $row['valor'] . "</td>";
    echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>
</body>
</html>



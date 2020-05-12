
<html>
<head>
<style>
table {
    width: 50%;
    border-collapse: collapse;
    margin: auto;
}

table, td, th {
    border: 1px solid black;
    padding: 15px;
    text-align: left;
    
}
td:hover {background-color: #f5f5f5;}

</style>
</head>
<body>

<?php
$q = $_GET['q'];

$con = mysqli_connect('localhost','felix312','1234','felix312_Loja');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}


$sql="SELECT * FROM Produtos WHERE Nome like '".$q."%'";
$result = mysqli_query($con,$sql);

echo "<table>
<tr>
<th>Nome</th>
<th>Valor</th>
<th>Quantidade</th>

</tr>";
while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['Nome'] . "</td>";
    echo "<td>" . $row['Valor'] . "</td>";
    echo "<td>" . $row['Quantidade'] . "</td>";
    echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>
</body>
</html>


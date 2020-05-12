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

$q = ($_GET['q']);

$con = mysqli_connect('localhost','metuzael433','1234','metuzael433_Loja');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}

$sql="select *from Carro where nome like  '".$q."%'";
$result = mysqli_query($con,$sql);

echo "<produtos.html>
<table border='1'>
<tr>
<th>Nome</th>
<th>Quantidade</th>
<th>Valor</th>
</tr>";
while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
 echo "<td>" . $row['Nome'] . "</td>";
    echo "<td>" . $row['quantidade'] . "</td>";
    echo "<td>" . $row['Valor'] . "</td>";
    echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>


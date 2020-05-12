<?php
$q = $_GET['q'];

$con = mysqli_connect('localhost','julio603','1234','julio603_Loja');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}


$sql="SELECT * FROM Produtos WHERE nome like '".$q."%'";
$result = mysqli_query($con,$sql);

echo "<table>
<tr>
<th>nome</th>
<th>unidade</th>
<th>valor</th>
</tr>";
while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['nome'] . "</td>";
    echo "<td>" . $row['unidade'] . "</td>";
    echo "<td>" . $row['valor'] . "</td>";
    echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>

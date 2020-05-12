<?php
$q = intval($_GET['q']);

$con = mysqli_connect('localhost','alana263','1234','alana263_aula23');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}


$sql="SELECT * FROM Lista WHERE id = '".$q."'";
$result = mysqli_query($con,$sql);

echo "<table>
<tr>
<th>Nome</th>
<th>Sobrenome</th>
<th>Idade</th>
<th>Cidade Natal</th>
<th>Profissão</th>
</tr>";
while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['Nome'] . "</td>";
    echo "<td>" . $row['Sobrenome'] . "</td>";
    echo "<td>" . $row['idade'] . "</td>";
    echo "<td>" . $row['cidade_natal'] . "</td>";
    echo "<td>" . $row['trabalho'] . "</td>";
    echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>

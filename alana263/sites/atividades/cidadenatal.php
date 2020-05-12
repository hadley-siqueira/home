<?php
$q = intval($_GET['q']);

$con = mysqli_connect('localhost','alana263','1234','alana263_aula23');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}


$sql="SELECT * FROM CidadeNatal WHERE id = '".$q."'";
$result = mysqli_query($con,$sql);

echo "<table>
<tr>
<th>Nome</th>
<th>Estado</th>
<th>Idade</th>
<th>País</th>
</tr>";
while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['nome'] . "</td>";
    echo "<td>" . $row['estado'] . "</td>";
    echo "<td>" . $row['idade'] . "</td>";
    echo "<td>" . $row['pais'] . "</td>";
    }
echo "</table>";
mysqli_close($con);
?>


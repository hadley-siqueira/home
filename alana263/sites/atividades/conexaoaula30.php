<?php
$q = intval($_GET['q']);

$con = mysqli_connect('localhost','alana263','1234','alana263_aula30');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}


$sql="SELECT * FROM InformacoesProduto".$q."'";
$result = mysqli_query($con,$sql);

echo "<table>
<tr>
<th>Nome</th>
<th>Preço</th>
<th>Origem</th>
<th>Garantia</th>
</tr>";
while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['nome'] . "</td>";
    echo "<td>" . $row['preco'] . "</td>";
    echo "<td>" . $row['origem'] . "</td>";
    echo "<td>" . $row['garantia'] . "</td>";
    }
echo "</table>";
mysqli_close($con);
?>

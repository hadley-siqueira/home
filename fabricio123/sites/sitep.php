<?php
$q =($_GET['q']);

$con = mysqli_connect('localhost','fabricio123','1234','fabricio123_produtos');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}


$sql="SELECT * FROM produtost WHERE nome like '".$q."%'";
$result = mysqli_query($con,$sql);

echo "<table>
<tr>
<th>nome</th>
<th>marca</th>
<th>quantidade</th>
<th>preco</th>
<th>descricao</th>
<th>observacoes</th>
</tr>";
while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['nome'] . "</td>";
    echo "<td>" . $row['marca'] . "</td>";
    echo "<td>" . $row['quantidade'] . "</td>";
    echo "<td>" . $row['preco'] . "</td>";
    echo "<td>" . $row['descricao'] . "</td>";
    echo "<td>" . $row['observacoes'] . "</td>";
    echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>

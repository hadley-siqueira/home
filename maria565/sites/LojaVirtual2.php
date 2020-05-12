<?php

$q = ($_GET['q']);

$con = mysqli_connect('localhost','maria565','1234','maria565_loja');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}

$sql="select *from loja where nome like  '".$q."%'";
$result = mysqli_query($con,$sql);

echo "<LojaVirtual.html>
<table border='1'>
<tr>
<th>nome</th>
<th>marca</th>
<th>quantidade</th>
<th>preco</th>
</tr>";
while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['nome'] . "</td>";
    echo "<td>" . $row['marca'] . "</td>";
    echo "<td>" . $row['quantidade'] . "</td>";
    echo "<td>" . $row['preco'] . "</td>";
    echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>




<?php
$q = ($_GET['q']);

$con = mysqli_connect('localhost','melissa328','1234','melissa328_Loja');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}
$sql="select * from LojaVirtual  where nome like '".$q."%'";
$result = mysqli_query($con,$sql);

echo 
"<table border='1'>
<tr>
<th>Nome</th>
<th>Marca</th>
<th>Quantidade</th>
<th>Preço</th>
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
</body>
</html>



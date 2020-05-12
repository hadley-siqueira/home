    <!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>

 
<?php

$q = ($_GET['q']);

$con = mysqli_connect('localhost','francisco050','1234','francisco050_Produtos');
if (!$con){ die('Could not connect: ' . mysqli_error($con)); }   

$sql="SELECT * FROM produtos WHERE nome = '".$q."'";
$result = mysqli_query($con,$sql);

echo "<table>
<tr>
<th>Nome</th>
<th>Quantidade</th>
<th>Status</th>
</tr>";

while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['nome'] . "</td>";
    echo "<td>" . $row['quantidade'] . "</td>";
    echo "<td>" . $row['status'] . "</td>";
    echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>

</body>
</html>





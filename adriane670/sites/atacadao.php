<!DOCTYPE html>
<html>
    <head>
        <style>
            table {
                margin:auto;
                width: 80%;
                border-collapse: collapse;                     
            }
            table, td, th {
                border: 1px solid black;
                padding: 5px;
            }
            th {text-align:left;}

        </style>
    </head>

    <body>
        <?php
        $q = intval($_GET['q']);

        $con = mysqli_connect('localhost','adriane670','1234','adriane670_atv');
        if (!$con) {
        die('Could not connect: ' . mysqli_error($con));
}

mysqli_select_db($con,"ajax_demo");
$sql="SELECT * FROM Produtos  WHERE none  = '".$q."'";
$result = mysqli_query($con,$sql);

echo "<table>
<tr>
<th>nome</th>
<th>preco</th>
<th>marca</th>
<th>descricao</th>
<th>observacao</th>
</tr>";
while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['nome'] . "</td>";
    echo "<td>" . $row['preco'] . "</td>";
    echo "<td>" . $row['marca'] . "</td>";
    echo "<td>" . $row['descricao'] . "</td>";
    echo "<td>" . $row['observacao'] . "</td>";
    echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>
</body>
</html>

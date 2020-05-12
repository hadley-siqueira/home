<!DOCTYPE html>
<html>
    <head>
     <style>
table {
    width: 100%;
    border-collapse: collapse;
}

table, td, th {
    border: 1px solid black;
    padding: 5px;
}

th {text-align: left;}
    </style>
    </head>
<body>

<?php
$q = intval($_GET['q']);

$con = mysqli_connect('localhost','sandy352','1234','sandy352_informacoes');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}


   $sql="SELECT * FROM informacoes WHERE id = '".$q."'";
   $result = mysqli_query($con,$sql);

echo "<table>
<tr>
<th>Id</th>
<th>nome</th>
th>marca</th>
<th>quantidade</th>
th>valor</th>
</tr>" ;

while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['Id'] . "</td>";
    echo "<td>" . $row['nome'] . "</td>";
    echo "<td>" . $row['marca'] . "</td>";
    echo "<td>" . $row['quantidade'] . "</td>";
    echo "<td>" . $row['valor'] . "</td>";
    echo "</tr>";
}
?>
</body>
</html>

<!DOCTYPE html>
<html>
<head>
<style>
table {
    width: 40%;
    border-collapse: collapse;
    margin-left: 45px;
}

table, td, th {
    border: 1px solid #ddd;
    padding: 5px;
}

th {text-align: left;}
</style>
</head>
<body>

<?php
$q = ($_GET['q']);$con = mysqli_connect('localhost','jorge207','1234','jorge207_livro');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}


$sql="SELECT * FROM livro WHERE nome like '".$q."%'";
$result = mysqli_query($con,$sql);

echo "<table>
<tr>
<th>Nome</th>
<th>Preço</th>
<th>Quantidade</th>
<th>Editora</th>
<th>Descrição</th>
<th>Observação</th>
</tr>";
while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['nome'] . "</td>";
    echo "<td>" . $row['preco'] . "</td>";
    echo "<td>" . $row['quantidade'] . "</td>";
    echo "<td>" . $row['editora'] . "</td>";
    echo "<td>" . $row['descricao'] . "</td>";
    echo "<td>" . $row['observacao'] . "</td>";
    echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>
</body>
</html>




<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
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
    $q = ($_GET['q']);

    $con = mysqli_connect('localhost','maria085','1234','maria085_aulaExemplo');
    if (!$con) {
        die('Could not connect: ' . mysqli_error($con));
    }

    mysqli_select_db($con,"Produtos");
    $sql="SELECT * FROM Produtos WHERE Nome like '".$q."%'";
    $result = mysqli_query($con,$sql);

    echo "<table>
    <tr>
    <th>nome</th>
    <th>preco</th>
    <th>quantidade</th>
    <th>marca</th>
    <th>descricao</th>
    <th>observacoes</th>
    </tr>";
    while($row = mysqli_fetch_array($result)) {
        echo "<tr>";
        echo "<td>" . $row['nome'] . "</td>";
        echo "<td>" . $row['preco'] . "</td>";
        echo "<td>" . $row['quantidade'] . "</td>";
        echo "<td>" . $row['marca'] . "</td>";
        echo "<td>" . $row['descricao'] . "</td>";
        echo "<td>" . $row['observacoes'] . "</td>";
        echo "</tr>";
    }
    echo "</table>";
    mysqli_close($con);
    ?>
</body>
</html>

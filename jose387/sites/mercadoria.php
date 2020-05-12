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

            th {text-align: left;}
        </style>
    </head>
    <body>

        <?php
        $q = $_GET['q'];

        $con = mysqli_connect('localhost','jose387','1234','jose387_mercado');
        if (!$con) {
            die('Could not connect: ' . mysqli_error($con));
        }

        mysqli_select_db($con,"ajax_demo");
        $sql="SELECT * FROM mercadoria WHERE Fruta like '".$q."%'";
        $result = mysqli_query($con,$sql);

        echo "<table>
        <tr>
            <th>id</th>
            <th>Fruta</th>
            <th>Peso</th>
            <th>Preco</th>
        </tr>";
        while($row = mysqli_fetch_array($result)) {
            echo "<tr>";
            echo "<td>" . $row['id'] . "</td>";
            echo "<td>" . $row['Fruta'] . "</td>";
            echo "<td>" . $row['Peso'] . "</td>";
            echo "<td>" . $row['Preco'] . "</td>";
            echo "</tr>";
        }
        echo "</table>";
        mysqli_close($con);
        ?>
    </body>
</html>


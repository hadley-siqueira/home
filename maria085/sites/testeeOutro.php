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
            $q = intval($_GET['q']);

            $con = mysqli_connect('localhost','maria085','1234','maria085_colegio');
            if (!$con) {
                die('Could not connect: ' . mysqli_error($con));
            }

            $sql="SELECT * FROM AulaAjaxCidades WHERE id = ".$q;
            $result = mysqli_query($con,$sql);

            echo "<table>
            <tr>
            <th>City</th>
            <th>Population</th>
            <th>Age</th>
            </tr>";
            while($row = mysqli_fetch_array($result)) {
                echo "<tr>";
                echo "<td>" . $row['City'] . "</td>";
                echo "<td>" . $row['Population'] . "</td>";
                echo "<td>" . $row['Age'] . "</td>";
                echo "</tr>";
            }
            echo "</table>";
            mysqli_close($con);
        ?>

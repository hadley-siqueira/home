<?php
    $q = ($_GET['q']);

    $con = mysqli_connect('localhost','larissa611','1234','larissa611_Form');
        if (!$con) {
          die('Could not connect: ' . mysqli_error($con));
    }
    $sql="select * from Form where nome like '".$q."%'";
    $result = mysqli_query($con,$sql);

    echo "<Form.html>
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

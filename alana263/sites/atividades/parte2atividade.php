<!DOCTYPE html>
<html>
    <?php include 'cabeca.php'; ?>
    <body>
        <h1>Lista de dados</h1>
        <ul>
            <li><?php echo $_GET['nome']; ?></li>
            <li><?php echo $_GET['email']; ?></li>
            <li><?php echo $_GET['tel']; ?></li>
        </ul>

    </body>
</html>

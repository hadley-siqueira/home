<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Página php</title>
        <link rel="icon" href="https://tecnoblog.net/wp-content/uploads/2010/06/elephpant.png" type="image/x-icon" />

    </head>

    <body>
        <?php
        echo "Oi,tudo bom?";
        ?> 
        <h1>Lista 1</h1>
        <ul>
            <?php
                for ($i = 0; $i < 10; $i++) {
            ?>
                <li><?php echo $i ?></li>
            <?php
                }
            ?>
        </ul>
        <h1>Lista 2</h1> 
        <?php include "lista.php"; ?>

        <form action="ola.php">
            <label>Nome</label>
            <input type="text" name="nome">
            <label>Idade</label>
            <input type="text" name="idade">
            <input type="submit" value="Enviar Dados">
        </form>
    </body>
</html>

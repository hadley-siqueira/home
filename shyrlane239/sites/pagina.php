<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
    </head>

    <body>
        <?php
            echo "Minha primeira pág, rapaize!";
        ?>
        <ul>
        <?php
            for ($i = 0; $i < 10; $i++){
        ?>
            <li><?php echo $i ?></li>
        <?php
            }
        ?>
        </ul>
    </body>
</html>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
    </head>
    <body>
        <?php
           echo "My fisrt PHP script";
        ?>
        <ul>
        <?php
            for ($1 = 0;$1 < 10;$1++){
        ?>
            <li><?php echo $1 ?></li>
        <?php
            }
        ?>
        </ul>
        <?php includ 'lista.php'; ?>
    </body>
</html>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php 
            echo "My first PHP script!";
        ?>
        <ul>
        <?php
            for($i = 0; $i < 10; $i++){
        ?>
            <li><?php echo $i ?></li>
        <?php
            }
        ?>
    </body>
</html>



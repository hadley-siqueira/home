<!DOCTYPE html>
<html> 
    <head>
        <meta charset="utf-8">
    </head>

    <body>
         <?php
             echo "My first PHP script!";
         ?> 
         <ul>
          <?php
              for ($i = 0; $i < 10; $i++) {
           ?> 
              <li><?php echo $i ?></li>

            <?php 
                }
            ?>
            </ul>
            <?php include 'lista.php'; ?>

    </body>
</html>

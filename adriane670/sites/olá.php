<!DOCTYPE html>
<html>
    <body>
        <p>Olá, <?php echo $_GET['nome']; ?>
        <?php
            $idade = (int) $_GET['idade'];
 
            if ($idade >= 18) {
                echo 'Voce eh maior de idade';
            } else {
                echo 'Voce eh menor de idade';
            }
        ?>
       
        </p>
    </body>
</html>

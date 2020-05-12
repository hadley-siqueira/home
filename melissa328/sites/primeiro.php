<!DOCTYPE html>
<html>
    <body>
        <?php
            echo "Minha primeira pagina em php";        
        ?>
    
        <ul>
            <?php for ($i = 0; $i < 100; $i++) { ?>
                <li><?php echo $i ?></li>
            <?php } ?>
        </ul>

        <?php
            for ($i = 0; $i < 5; $i++) {
                include 'receita.php';
            }
        ?>
    </body>
</html>
 

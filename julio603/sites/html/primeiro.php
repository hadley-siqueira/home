<!DOCTYPE>
<html>
    <body>
        <?php
            echo "Minha Primeira pagina php"
        ?>
        <ul>
           <?php for ($i = 0; $i < 101; $i++){ ?>
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

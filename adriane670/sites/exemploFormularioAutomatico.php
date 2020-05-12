<?php
    $tantofaz = array('Nome', 'Idade', 'Telefone', 'Email', 'Matricula', 'Cidade', 'CPF', 'Endereco', 'Sexo');
?>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        

         <style>
            input[type=text], select {
                 width: 100%;
                 padding: 12px 20px;
                 margin: 8px 0;
                 display: inline-block;
                 border: 1px solid #ccc;
                 border-radius: 4px;
                 box-sizing: border-box;
            }

            input[type=submit] {
                width: 100%;
                background-color: #4CAF50;
                color:white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                border-radius: 4px;
                cursor: pointer;
            }

            input[type=submit]:hover {
                background-color: #45a049;
            }

            div {
                 border-radius: 5px;
                background-color: #f2f2f2;
                padding: 20px;
                margin: auto;
                margin-top:100px;
                width:700px;
                
            }
            h1 {
                text-align: center;
                
            }
            body { background-image:url(http://escoladeimpressao3d.com.br/wp-content/uploads/2017/02/background.jpg)}
        </style>
     </head>


    <body>
        <div class="divisao">
        <form>
        <?php foreach ($tantofaz as $t) { ?>
            <label><?php echo $t ?></label>
            <input type="text" name="<?php echo $t ?>">
        <?php } ?>
        </form>
        </div>
    </body>
</html>


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
        <h1>Cadastro de contato</h1>
        <form action="inserirContato.php" method="post">
            <label>Nome</label>
            <input type="text" name="Nome">
          <br> 
            <label>Telefone</label>
            <input type="text" name="telefone">
            <br>
            <label>Email</label>
            <input type="text" name="email">
            <br>
            <input type="submit" value="Criar Contato">
        </form>
        </div>
    </body>
</html>

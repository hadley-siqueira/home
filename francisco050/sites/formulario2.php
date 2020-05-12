<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8"/>
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
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                
            }

            Input[type=submit]:hover {
                background-color: #45a049;
            }

            div {
                margin: auto;
                width: 50%;
                border-radius: 5px;
                background-color: #f2f2f2;
                padding: 20px;
                margin-top: 100px;
                -webkit-box-shadow: 0px -10px 1px 0px rgba(28,148,28,1);
                -moz-box-shadow: 0px -10px 1px 0px rgba(28,148,28,1);
                box-shadow: 0px -10px 1px 0px rgba(28,148,28,1);

    
            }
         
            h1{
                text-align: center;
                font-size: 50px;
                font-variant: small-caps;
            } 
            label {
                font-color: #fff;
            }
        </style>
    </head>
    
    <body background="http://escoladeimpressao3d.com.br/wp-content/uploads/2017/02/background.jpg"; background-size:cover; >
    
    <div>
        <h1>Cadastro de Contatos</h1>
        <form action="inserirContato2.php" method="post">

      
            <label>Nome</label>
            <input type="text" id="fname" name="nome" placeholder="exemplo: João"></br>            

            <label>Telefone</label>
            <input type="text" id="fname" name="telefone" placeholder="exemplo: (84) 9 87654321"></br>

            <label>Email</label>
            <input type="text" id="fname" name="email" placeholder="exemplo: joão@gmail.com"></br>


            <input type="submit" value="Criar Contato">
        </form>
    </div>
    </body>
</html>

<!DOCTYPE html>
<html>
    <head>
        <title> Sistem de Cadastro </title>
        <style>
        body {
           background-color: #191919;
       
        }
        #caixa {
            margin: auto;
            margin-top: 50px ;
            width: 40%; 
            text-align: center;
            border-style: outset;
            border-radius: 5px;
        }
        #caixa h2{
            color: #fff;
            text-align:center;
            font-size: 40px;
            font-variant: small-caps;

        }
        input[type=text]{
            width: 92%;
            box-sizing: border-box;
            margin: 10px 0;
            padding: 8px;
            background: none;
            color: #fff;
            outline: none;
            border: none;
            border-bottom: 1px solid #fff;
 
        }
        input[type=password]{
            width: 92%;
            box-sizing: border-box;
            margin: 10px 0;
            padding: 8px;
            border: none; 
            background: none;
            border-bottom: 1px solid #fff;  
            outline: none;
            color: #fff; 
        }
        input[type=submit]{
           width: 40%;
           padding: 10px;
           box-sizing: border-box;
           margin: auto;
           margin: 12px 0;
           cursor:pointer;
           border-radius: 3px; 
            transition:  0.1s;
         }
        input[type=submit]:hover{
           
           opacity: 0.6; 
        }
        label {
            color: #fff;
            font-variant: small-caps;
        }
        </style>
    </head>

    <body>
    <div id="caixa">
        <h2>Inscrever-se</h2>
        <form method="post" action="cadastrando.php">
            <label>Nome: </label> <input type="text" name="nome" placeholder="exemplo: João"/></br>
            <label> Telefone:</label> <input type="text" name="telefone" placeholder="exemplo: (84) 9 87654321"/></br>
            <label>Email:</label> <input type="text" name="email" placeholder="exemplo: joao@email.com"/></br>
            <label>Senha:</label> <input type="password" name="senha"/></br>
            <input type="submit" value="Enviar Cadastro"/> </br>
        </form>
    </div>
    </body>
</html>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <style>
            .titulo {
                text-align: center;  
                font-family: Times new Roman;
            }
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
        font-size: 20px;
        margin: 8px 0;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }

    input[type=submit]:hover {
        background-color: #7FFFD4;
    }

    form {
        border-radius: 5px;
        background-color:#F0FFFF;
        padding:20px;
        width: 40%;
        margin:auto;
        margin-top: 130px;
        border-top: 8px solid green;

    }
    body {
                margin: 0;
                padding:0;
                background-image:url("http://escoladeimpressao3d.com.br/wp-content/uploads/2017/02/background.jpg");
                min-height: 100%;
                background-size: cover;
                background-attachment: fixed;
                background-repeat: no-repeat;
                background-position: center center;
            }
        </style>
    </head>

    <body>
        <form action="inserirContatos2.php" method="post">
        <h1 class="titulo">Cadastro de contatos</h1>
        <label>Nome: </label>
        <input type="text" name="nome">

        <label>Telefone: </label>
        <input type="text" name="telefone">

        <label>Email: </label>
        <input type="text" name="email">

        <input type="submit" value="Criar contato">
        </form>
    </body>
</html>

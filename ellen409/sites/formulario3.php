<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
        <style>
        .formulario{
            font-family: Roboto;
            width: 700px;
            margin: auto;
            color: #f21e1e;
            font-weight: bold;
        }
        body {
            background-image: url("https://s-media-cache-ak0.pinimg.com/originals/0c/6b/0a/0c6b0a4cf2da2b59196de5c521049ef6.png");
            background-size: cover;
            background-repeat: no-repeat;
        }
        .formulario h1{
            font-size: 40px;
            font-weight: bold;
            font-variant: small-caps;
            text-align: center; 
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
            background-color: #f21e1e;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        input[type=submit]:hover {
            background-color: #ab0909;
        }

        div {
            border-radius: 5px;
            background-color: #f2f2f2;
            padding: 20px;
            box-shadow: 0px 0px 16px 3px rgba(0,0,0,0.75);
        }
        </style>
    </head>

    <body>
    <section class="formulario">
    <h1>Cadastro de contatos</h1>
    <div>
    <form action="inserirContato3.php" method="post">
        <label>Matricula</label>
        <input type="text" name="matricula">

        <label>Nome</label>
        <input type="text" name="nome">

        <label>CPF</label>
        <input type="text" name="cpf">
    
        <label>Idade</label>
        <input type="text" name="idade">

        <label>Pai</label>
        <input type="text" name="pai">

        <label>Mãe</label>
        <input type="text" name="mae">
        
        <label>Telefone</label>
        <input type="text" name="telefone">

        <label>Email</label>
        <input type="text" name="email">

        <label>Endereço</label>
        <input type="text" name="endereco">

        <input type="submit" value="Criar Contato">
    </form>
    </div>
    </section>
    </body>
</html>

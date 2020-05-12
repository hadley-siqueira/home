<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        
        <style>

            .titulo {
                font-family: "Times New Roman";
                font-weight: bold;
                font-size: 45px;
                text-align: center;
            }

            .fonte {                
                font-family: "Times New Roman";
                font-weight: bold;
                font-size: 20px;
            }

            input[type=text] {
                width: 100%;
                padding: 12px 20px;
                margin: 8px 0;
                box-sizing: border-box;
                border: 1px solid #B5B5B5;
                border-radius: 6px;
            }

            body {
                background-image:url(" http://escoladeimpressao3d.com.br/wp-content/uploads/2017/02/background.jpg");
            }

            .quadro {
                padding:15px;
                width: 700px;
                margin: auto;
                background-color: #FFFFFF;
                box-shadow: 2px 2px 10px -1px rgba(0,0,0,0.75);
                margin-top: 160px;
            }

            .botao {
                text-decoration: none;
                display: inline-block;
                font-size: 20px;
                text-align: center;
                padding: 15px 32px;
                width: 100%;
                color: white;
                background-color: #4CAF50;
                border: none;
                border-radius: 4px;
                box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
            }

            .botao:hover {
                background-color: #4CAF40;
                color: white;
            }

        </style>
    </head>

    <body>
        <div class="quadro">
            <h1 class="titulo">Cadastro de Contatos</h1>
            <form action="inserirContato2.php" method="post">
                <label class="fonte">Nome</label>
                <input type="text" name="nome">

                <label class="fonte">Telefone</label>
                <input type="text" name="telefone">

                <label class="fonte">Email</label>
                <input type="text" name="email">

                <input class="botao" type="submit" value="Criar Contato">
            </form>
        </div>
    </body>
</html>

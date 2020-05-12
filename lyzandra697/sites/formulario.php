<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
         <style>
            body {
                background-image:url("http://escoladeimpressao3d.com.br/wp-content/uploads/2017/02/background.jpg");
                background-repeat: no-repeat;
            }
            p {
                 font-family: "Times New Roman", Times, serif;
            }
            .formulario{
                font-family: "Times New Roman";
                width:700px;
                margin: auto;
            }
            .formulario h1{
                font-size: 45px;
                text-align: center;
                color: #f2f2f2;
                margin: auto; 
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
               margin: 8px 0;
               border: none;
               border-radius: 4px;
               cursor: pointer;
            }
             input[type=submit]:hover {
               background-color: #45a049;
            }

            div {
               width:40%;
               margin:auto;
               border-radius: 5px;
               background-color: #f2f2f2;
               padding: 20px;
            }
        </style>
    </head>

    <body>
       <div>
      <h1>Cadastro de Contato</h1>
      <form action="inserirContato.php" method="post">
        <label>Nome</label>
        <input type="text" name="nome">

        <label>Telefone</label>
        <input type="text" name="telefone">

        <label>Email</label>
        <input type="text" name="email">

        <input type="submit" value="Criar Contato">
      </form>
        </div>
    </body>
</html>

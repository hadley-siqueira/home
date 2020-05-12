<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <link href="https://fonts.googleapis.com/css?family=Frank+Ruhl+Libre" rel="stylesheet">
    </head>

    <style> 
      body {
        background-image:url(http://escoladeimpressao3d.com.br/wp-content/uploads/2017/02/background.jpg);
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
      border-radius: 5px;
      background-color: #f2f2f2;
      padding: 20px;
    }

    form {
      width: 50%;
      margin-left:300px;
      background-color:#FFFAFA;
      padding: 25px;
      margin-top:100px;
      

     -webkit-box-shadow: 0px -2px 67px -5px rgba(0,0,0,0.75);
    -moz-box-shadow: 0px -2px 67px -5px rgba(0,0,0,0.75);
    box-shadow: 0px -2px 67px -5px rgba(0,0,0,0.75);

    } 
   
    h1 {
     margin-left:120px;
     font-family: 'Frank Ruhl Libre', serif;
     font-size:50px;
    } 

   

     </style>

    <body>
        

        
        <form action="inserirContato2.php" method="post">
             <h1>Cadastro de Contato</h1>
             <label>Nome</label>
            <input type="text" name="nome">

            <label>Telefone</label>
            <input type="text" name="telefone">

            <label>Email</label>
            <input type="text" name ="email">

            <input type="submit" value="Criar Contato">
        </form>
    </body>
</html>




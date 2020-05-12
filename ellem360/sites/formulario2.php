<!DOCTYPE html>
<html>
    <head>
        <meta charset="uft-8">
        <style>
        body {
            background-image:url("http://www.cherishpr.com/wp-content/uploads/2017/06/dots.jpg");
            background-repeat: no-repeat;
            background-size:cover;
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
        background-color: #CD6889;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
         border: none;
        border-radius: 4px;
        cursor: pointer;
    }

    input[type=submit]:hover {
        background-color: #CD6889;
    }

    div {
        border-radius: 5px;
        background-color: #f2f2f2;
         padding: 20px;
    }
    
    .secao1 h1{
        text-align:center;
        font-size: 50px;
        font-variant: small-caps;
      
    }
    .secao1{
        font-family:"times new roman";
        width: 500px;
        margin: auto;
        color: #CD6889;
    }   
        </style>
    </head>

    <body>
         <section class="secao1">
        <h1>Cadastro de contato</h1>
        <div>
        <form action="inserirContato.php" method="post">
            <label>Nome</label>
            <input type="text" name="nome">

            <label>Telefone</label>
            <input type="text" name="telefone">

             <label>Email</label>
            <input type="text" name="Email">

            <input type="submit" value="Criar Contato">
        </form>
        </div>
        </section>
   </body>
</html>



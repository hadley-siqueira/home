<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        
    </head>
    <style>
        body {

            .background-pagina {
              z-index:-1;
              float:left;
              position:fixed;
              width:100%;
              height:800px;
              background:url("http://escoladeimpressao3d.com.br/wp-content/uploads/2017/02/background.jpg") no-repeat;
              background-size:100% 100%;
             } 
   </style>
    <body>
      <div class="background-pagina">

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
    </body>
</html>


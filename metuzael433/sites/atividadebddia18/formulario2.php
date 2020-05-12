<!DOCTYPE html>
<html>
  <head>
     <meta charset="utf-8">
     <style type="text/css">


        input[type=text] {      
    width: 90%;
    padding: 10px 25px;
    margin: 8px 0;
    box-sizing: border-box;
    border: 2px solid #e2e2e0;
    border-radius: 4px;
    background-color: #ffffff;
    color: #c9c8c7;
   
   }

    .botao1 {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 10px 25px;
    text-decoration: none;
    margin: 4px 2px;
    cursor: pointer;
    width: 90%;
    text-align: center;
   }
    
    .titulo {
    text-align: center;
    padding-top: 20px;
    padding-bottom: 20px;
   }
  
   .container {
        width: 100vw;
        height: 100vh;
        background: url("http://escoladeimpressao3d.com.br/wp-content/uploads/2017/02/background.jpg");
        display: flex;
        flex-direction: row;
        justify-content: center;
        align-items: center
    }
    .box {
         width: 500px;
         height: 500px;
         background: #fff;
         padding-left: 30px;

     }
    body {
        margin: 0px;
    </style>
  </head>

  <body>
    <h1>Cadastro de Contatos</h1>
    <form action="inserirContato.php" method="post">
      <div class="container">
     <div class="box">
      <label>Nome</label>
      <input type="text" name="nome">

      <label>Telefone</label>
      <input type="text" name="telefone">
    
      <label>Email</label>
      <input type="text" name="email">

      <input type="submit" value="Criar Contato">
       </div>
     </div>
   </form>
   </body>
</html>

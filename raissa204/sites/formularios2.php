<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
  </head>
    <style> 
     body{
        margin:0px;
        padding:0px;
      } 
     input[type=text] {
    width: 50%;
    padding: 12px 20px;
    margin: 8px 0;
    box-sizing: border-box;
} 

      h1 {
      font-size: 40px;
    } 
     .ok{
       padding-top:12;
       font-family: Arial, Helvetica, sans-serif;
       font size:20px;
       color:black;
     }
     .button {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
   }
    
 
    </style>
  <body>
     <body background="http://escoladeimpressao3d.com.br/wp-content/uploads/2017/02/background.jpg">
    <h1>Cadastro de Contato</h1>
    <form action="inserirContato.php" method="post">
       <div class="ok"
      <label>Nome</label>
       </div>
      <input type="text" name="nome">
        <div class="ok"
      <label>Telefone</label>
        </div>
      <input type="text" name="telefone">
         <div class"ok"
      <label>Email</label>
       </div>
      <input type="text" name="email">
      <input type="submit" class= "button" value="Criar Contato">
      </form>
     </body>
</html>


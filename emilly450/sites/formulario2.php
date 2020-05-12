<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <style>
      body{
        background-image:url("http://xdesktopwallpapers.com/wp-content/uploads/2012/07/Green%20Parrot%20On%20Green%20Background.jpg");
                background-repeat: no-repeat;
      }
      p {
         font-family: "Times New Roman", Times, serif;
      }
           
      .formulario {
            float:left;
            width:40%;
            margin-left:30%;
            margin-top:150px;
      }
      .formulario h1 {
            font-family: "Times New Roman";
            width:500px;
            margin:auto;
            
      }
      .formulario h1{
                font-size: 60px;
                text-align:center;
                color:;
      }
      input:not(.botao), select {
               width: 100%;
               padding: 12px 20px;
               margin: 8px 0;
               display: inline-block;
               border: 1px solid #ccc;
               border-radius: 4px;
               box-sizing: border-box;
      }

      .botao {
               width: 100%;
               background-color: #4CAF50;
               color: white;
               padding: 14px 20px;
               margin: 8px 0;
               border: none;
               border-radius: 4px;
               cursor: pointer;
      }      
      .botao:hover {
               background-color: #45a049;
      }

            div {
               border-radius: 5px;
               background-color: #f2f2f2;
               padding: 20px;
            }
    </style>
  </head>

  <body>
   <section class="formulario">
    
     <div>
        <h1>Cadastro de Contato</h1>
        <form action="inserirContato2.php" method="post">
          <label>Nome</label>
          <input type="text" name="nome">

          <label>Telefone</label>
          <input type="text" name="telefone">

          <label>Email</label>
          <input type="text" name="email">

          <input type="submit" class="botao" value="Criar Contato">
        </form>
     </div>
   </section>
  </body>
</html>

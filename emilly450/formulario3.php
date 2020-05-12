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
         text-align:center;
         color:#f2f2f2;
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
    </style>
  </head>

  <body>
    <section class="formulario">
      <h1>Cadastro de Alunos</h1>
      <div>
         <form action="inserirAlunos3.php" method="post">
           <label>Matrícula</label>
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

           <input type="submit" value="Criar Matrícula">

       </form>
     </div>
    </section>
  </body>
</html>

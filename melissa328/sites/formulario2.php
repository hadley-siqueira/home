<!DOCTYPE html>
<html>
  <style>
input[type=text], select {
    width: 100%;
    background-color: #FF88C2;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 100%;
    background-color: #FF88C2;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #FF88C2;
}

div {
    border-radius: 5px;
    background-color: #FF88C2;
    padding: 20px;
    width:70%;
    background-color: #fff;
    box-shadow: 0px 0px 5px #000;
    margin: auto;
    margin-top: 200px;

}
  </style>
    <head>
        <meta charset="utf-8">
    <body background= https://i.pinimg.com/736x/ea/9c/d8/ea9cd89e58a4189178f4e4d9d252b80b--photo-backdrops-carrefour.jpg>
    </head>
 
    <body>
     <div> 
      <h1>Cadastro de Contato</h1>
      <form action="inserirContato.php"method="post" >
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


<!DOCTYPE html>
<html>
<style>


body{
    background-image: url(http://escoladeimpressao3d.com.br/wp-content/uploads/2017/02/background.jpg);
    background-size: cover;

}

h1 {

  font-family: "Times New Roman", Times, serif;
  font-variant: small-caps;
  font-size: 50px;
}
label {

  font-weight: bold;

}

input {
    width: 100%;
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
    border-width: 10px 10px 3px 10px;
    border-top-color: #79ec7e;
    border-top-style: inset;
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
    width:50%;
    position: absolute;
    left: 25%;
    top: 10%;
    -webkit-box-shadow: -2px 2px 85px -19px rgba(0,0,0,0.55);
-moz-box-shadow: -2px 2px 85px -19px rgba(0,0,0,0.55);
box-shadow: -2px 35px 85px -19px rgba(0,0,0,0.55);
}
p {
     font-family: Arial, Helvetica, sans-serif;
}

</style>
<head>
    <meta charset="utf-8">
</head>

</div>

 <div>   <form action="inserirContato3.php" method="post">

        <h1 style="left: 25%; margin-left: 5%; text-align:center; ">Cadastro de Contato</h1>
        <label>Matricula</label>
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
        <input typr="text" name="endereco">

        <input type="submit" value="Criar Contato">
    </form>
  </div>
   </body>
</html>
 

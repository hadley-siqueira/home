!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <style>
            .titulo {
                text-align: center;
                font-family: Times new Roman;
            } 

            body {

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
   background-color: #7FFFD4;
}

form {
    border-radius: 5px;
    background-color:#F0FFFF;
    padding:20px;
    width: 40%;
    margin:auto;
    margin-top: 130px;
    border-top: 8px solid green;

}
body {
                margin: 0;
                background-image:url(http://www.osmais.com/wallpapers/201112/estrelas-douradas-wallpaper.jpg );
                padding:0;
                min-height: 100%;
                background-size: cover;
                background-attachment: fixed;
                background-repeat: no-repeat;
                background-position: center center;
            }
        </style>
    </head>

    <body>
        <form action="inserirContato2.php" method="post">
        <h1 class="titulo">Cadastro de Aluno</h1>
        <label>Matricula: </label>
        <input type="text" name="matricula">

        <label>Nome: </label>
        <input type="text" name="nome">

        <label>Cpf: </label>
        <input type="text" name="cpf">

        
        <label>Idade: </label>
        <input type="text" name="idade">
        <label>PAI: </label>
        <input type="text" name="Pai">
        <label>Mãe: </label>
        <input type="text" name="Mãe">
        <label>Telefone: </label>
        <input type="text" name="telefone">
        <label>Email: </label>
        <input type="text" name="email">
         <label>Endereço: </label>
        <input type="text" name="endereço">

        
        <input type="submit" value="Criar contato">
        </form>
    </body>
</html>
          

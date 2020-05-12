<!DOCTYPE html>
<html>
   <style>
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
  <head>
      <style>
.button {
  display: inline-block;
  padding: 15px 25px;
  font-size: 24px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: #4CAF50;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
}

.button:hover {background-color: #3e8e41}

.button:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
</style>
</head>
<body>

<h2>Animated Buttons - "Pressed Effect"</h2>

<button class="button">Click Me</button>

</body>
     <meta charset="utf-8">
  </head>
     <style>
         

            .titulo {
                font-family: "Times New Roman";
                font-weight: bold;
                font-size: 45px;
                text-align: center;
            }

            .fonte {                
                font-family: "Times New Roman";
                font-weight: bold;
                font-size: 20px;
            }

            input[type=text] {
                width: 100%;
                padding: 12px 20px;
                margin: 8px 0;
                box-sizing: border-box;
                border: 1px solid #B5B5B5;
                border-radius: 6px;
            }

            body {
                background-image:url(" http://escoladeimpressao3d.com.br/wp-content/uploads/2017/02/background.jpg");
            }

            .quadro {
                padding:15px;
                width: 700px;
                margin: auto;
                background-color: #FFFFFF;
                box-shadow: 2px 2px 10px -1px rgba(0,0,0,0.75);
                margin-top: 160px;
            }

            .botao {
                text-decoration: none;
                display: inline-block;
                font-size: 20px;
                text-align: center;
                padding: 15px 32px;
                width: 100%;
                color: white;
                background-color: #4CAF50;
                border: none;
                border-radius: 4px;
                box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
            }

            .botao:hover {
                background-color: #4CAF40;
                color: white;
            }

        </style>

  <body>
     <h1>Cadastro de Contato</h1>
     <form action="inserirContato2.php" method="post">
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

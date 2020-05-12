<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
  
        <style>
             #qdr{
                background-color: #EEEEEE;
                text-align:center;
                width: 50%;
                padding-left: 40px;
                padding-right: 40px;
                margin: 100px; 
                margin-left: 270px;
                border: 2px solid #EEEEEE;
                border-radius: 20px;
            } 

            #titulo{
                font-family: "Lucida Console", serif;
                text-align: center;
                font-weight: bold;
                color: #004D40;
            }
            
            input[type=submit]{
                width: 100%;
                color: #ffffff;
                font-family: "Courier New", serif;
                font-weight: bold;
                font-size: 20px;
                text-align: center;
                padding: 15px 20px;
                margin: 30px 0;
                border: 1px solid #ccc;
                border-radius: 8px;
                box-sizing: border-box;
                background-color: #00897B;    
                cursor: pointer;
            }
            
            input[type=text], select {
                width: 100%;
                background-color: #F5F5F5;
                border: 2px solid #00897B;
                border-radius: 8px;
                display: inline-block;
                padding: 12px 20px;
                margin 10px 0;
                box-sizing: border-box;
            }

            
            input[type=submit]:hover {
                background-color: #00695C;
            }
            
            #ask {
                font-size: 20px;
                font-family: Verdana;
                font-width: bold;
                color: #004D40 ;    
            }       
        </style>
    </head>

    <body background="http://escoladeimpressao3d.com.br/wp-content/uploads/2017/02/background.jpg">
    <div id="qdr">
        <div id="titulo">
            <h1 style="font-size:35px">Cadastro de Contatos</h1>
        </div>
        
        <form action="inserirContatos2.php" method="post">

            <label id="ask">Nome</label>
            <input type="text" name="nome" placeholder="Ex.: Shyrlane Mello">
            
            <label id="ask">Telefone</label>  

            <input type="text" name="telefone" placeholder="Ex.: (84)999707070">

            <label id="ask">Email</label>
            <input type="text" name="email" placeholder="Ex.: shyrlane@email.com">
        
            <input type="submit" value="Criar Contato">
        
        </form>
    </div>
    </body>
</html>


<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <style>
            body {width:80%;  margin:0px; padding:0px; background:url("http://escoladeimpressao3d.com.br/wp-content/uploads/2017/02/background.jpg") no-repeat;}
            section {width:60%; margin-left:30%; margin-top:100px; height:700px; background-color:gainsboro; border-top:4px solid green;}
            h1 {float:left; width:100%; margin-top:20px; text-align:center; font-size:30px; font-family:;}
            label {float:left; width:90%; margin-left:5%; font-size:14px; font-weight:bold; margin-top:10px; margin-bottom:5px;}
            input:not(.button) {float:left; width:88%; margin-left:5%; padding:10px 1%; background-color:#FFF; border:1px solid silver; border-radius:4px;}
            input:not(.button):focus {outline-color:green;}
            .button {float:left; transition:all 0.5s; background-color:green; border:none; padding-top:10px; color:#FFF; cursor:pointer; padding-bottom:10px; border-radius:5px; width:90%; margin-top:15px; margin-left:5%;}
            .button:hover {background-color:#006400; transition:all 0.5s;}
        </style>
    </head>
    <body>
        <section>
        <h1>Cadastro de Aluno</h1>
        <form action="inserirAluno.php" method="post">
	    <label>Matricula:</label>
            <input type="text" name="matricula" />
            <label>Nome:</label>
            <input type="text" name="nome" />
	    <label>CPF:</label>
            <input type="text" name="cpf" />
	    <label>Idade:</label>
            <input type="text" name="idade" />
	    <label>Pai:</label>
            <input type="text" name="pai" />
	    <label>Mãe:</label>
            <input type="text" name="mae" />
            <label>Telefone:</label>
            <input type="text" name="telefone" />
            <label>Email:</label>
            <input type="text" name="email" />
	    <label>Endereço:</label>
            <input type="text" name="endereco" />

            <input type="submit" class="button" value="Criar Aluno" />
        </form>
        </section>
    </body>
</html>



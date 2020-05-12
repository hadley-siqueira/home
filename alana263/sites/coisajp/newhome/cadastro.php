<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
                <link rel="stylesheet" href="css/estilo.css">

                        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
    </head>
    <body>
      <ul class="nav">
           <li><a href="portugol.html"><i class="fa fa-home" aria-hidden="true"> Início</i></a></li>
           <li><a href="contato.html"><i class="fa fa-phone" aria-hidden="true"></i> Contatos</a></li>
           <li><a href="cadastro.php"><i class="fa fa-file" aria-hidden="true"></i> Cadastre-se</a></li>
           <li><a href="about.html"><i class="fa fa-question-circle" aria-hidden="true"></i> Sobre</a></li>
      </ul>


        <section class="secao-cadastro">
<form class="form" action="inserircadastro.php" method="post">
        <h1 class="titulo">Cadastre-se</h1>
        <label>Nome: </label>
        <input type="text" name="nome">

        <label>Telefone: </label>
        <input type="text" name="telefone">

        <label>Email: </label>
        <input type="text" name="email">
        <input type="submit" class="botcas" value="Cadastrar">
        </form>
        </section>
    </body>
</html>

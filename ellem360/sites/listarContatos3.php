<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
    </head>

    <style>
        body {
            background-image:url("http://www.cherishpr.com/wp-content/uploads/2017/06/dots.jpg");
            background-repeat: no-repeat;
            background-size:cover;
            margin:0;
            padding:0;
    }
        #customers {
        font-family: "Times new roman";
        border-collapse: collapse;
        width: 90%;
        margin:auto;
    }

    #customers td, #customers th {
        border: 1px solid #ddd;
        padding: 8px;
    }

    #customers tr:nth-child(even){background-color: #f2f2f2;}

    #customers th {
        padding-top: 12px;
        padding-bottom: 12px;
        text-align: center;
        background-color: #CD6889;
        color: Black;
    }
        .secao2 h1 {
        text-align: center;
        font-size:50px;
        color:#CD6889;
        font-variant: small-caps;
        font-family:"Times new roman";
        font-weight:normal;
        
        }
        a {float:left; transition:all 0.5s; width:40%; margin-left:30%; padding-top:15px; padding-bottom:15px; background-color:#CD6889; color:#FFF; font-family:times new roman; text-decoration:none; margin-top:35px; margin-bottom:15px; text-align:center; }
        a:hover {background-color:Crimson; transition:all 0.5s;}
        div {width:50%; margin-left:25%; padding-bottom:20px; padding-top:20px; background-color:#fff; box-shadow:1px 1px 6px black;}
    </style>
    <body>
        <section class="secao2">
        <h1>Contatos cadastrados</h1>
        </section>
        <div>
        <table id="customers">
          <thead>
            <tr>
              <th>Matricula</th>
              <th>Nome</th>
              <th>Cpf</th>
              <th>Idade</th>
              <th>Pai</th>
              <th>Mae</th>
              <th>Telefone</th>
              <th>Email</th>
              <th>Endereco</th> 

            </th>
        
             
          </thead>

        <tbody>
          <?php foreach ($resultado as $k) { ?>
          <tr>
            <td><?php echo $k['Matricula'] ?></td>
            <td><?php echo $k['Nome'] ?></td>
            <td><?php echo $k['Cpf'] ?></td>
            <td><?php echo $k['Idade'] ?></td>
            <td><?php echo $k['Pai'] ?></td>
            <td><?php echo $k['Mae'] ?></td>
            <td><?php echo $k['Telefone'] ?></td>
            <td><?php echo $k['Email'] ?></td>
            <td><?php echo $k['Endereco'] ?></td>
    
   

             </tr>
            <?php } ?>
         </tbody>
      </table>
    </body>
</html>
                  

<?php
    
    $parametro = isset($_POST['pesquisaProdutos']) ? $_POST['pesquisaProdutos'] : null;
    $msg = "";
    
    $msg .="<table class='table table-hover'>";
    $msg .="    <thead>";
    $msg .="        <tr>";
    $msg .="            <th>#</th>";
    $msg .="            <th>Nome:</th>";
    $msg .="            <th>E-mail:</th>";
    $msg .="        </tr>";
    $msg .="    </thead>";
    $msg .="    <tbody>";
                 
               
                require_once('class/Form.html');
                    try {
                        $pdo = new Conexao(); 
                        $resultado = $pdo->select("SELECT * FROM cliente WHERE nome LIKE '$parametro%' ORDER BY nome ASC");
                        $pdo->desconectar();
                                 
                        }catch (PDOException $e){
                            echo $e->getMessage();
                        }   
                        
                        if(count($resultado)){
                            foreach ($resultado as $res) {
 
    $msg .="                <tr>";
    $msg .="                    <td>".$res['idCliente']."</td>";
    $msg .="                    <td>".$res['nome']."</td>";
    $msg .="                    <td>".$res['email']."</td>";
    $msg .="                </tr>";
                            }   
                        }else{
                            $msg = "";
                            $msg .="Nenhum resultado foi encontrado...";
                        }
    $msg .="    </tbody>";
    $msg .="</table>";
    
    echo $msg;
?>

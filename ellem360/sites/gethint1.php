<?php
// Array with names
$a[] = "Afonso Cláudio";
$a[] = "Água Doce do Norte";
$a[] = "Baixo Guandu";
$a[] = "Barra de São Francisco";
$a[] = "Cachoeiro de Itapemirim";
$a[] = "Cariacica";
$a[] = "Divino de São Lourenço";
$a[] = "Dores do Rio Preto";
$a[] = "Ecoporanga";
$a[] = "Fundão";
$a[] = "Governador Lindenberg";
$a[] = "Guaçuí";
$a[] = "Ibatiba";
$a[] = "Ibiraçu";
$a[] = "Ibitirama";
$a[] = "Jaguaré";
$a[] = "Laranja da Terra";
$a[] = "Marataízes";
$a[] = "Nova Venécia";
$a[] = "Pancas";
$a[] = "Rio Bananal";
$a[] = "Santa Leopoldina";
$a[] = "Vargem Alta";
$a[] = "Venda Nova do Imigrante";


// get the q parameter from URL
$q = $_REQUEST["q"];

$hint = "";

// lookup all hints from array if $q is different from "" 
if ($q !== "") {
    $q = strtolower($q);
    $len=strlen($q);
    foreach($a as $name) {
        if (stristr($q, substr($name, 0, $len))) {
            if ($hint === "") {
                $hint = $name;
            } else {
                $hint .= ", $name";
            }
        }
    }
}

// Output "no suggestion" if no hint was found or output correct values 
echo $hint === "" ? "no suggestion" : $hint;
?>

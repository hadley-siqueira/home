<?php
// Array with names
$a[] = "Alto do Rodrigues";
$a[] = "Caicó";
$a[] = "Macau";
$a[] = "Natal";
$a[] = "Guamaré";
$a[] = "João Pessoa";
$a[] = "Pendências";
$a[] = "Baixa do Meio";
$a[] = "João Câmara";
$a[] = "Jandaíra";


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
echo $hint === "" ? "Não temos esse nome cadastrado." : $hint;
?>

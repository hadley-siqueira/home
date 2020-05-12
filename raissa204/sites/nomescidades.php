<?php
// Array with names
$a[] = "Macau";
$a[] = "Natal";
$a[] = "Guamare";
$a[] = "Joao Pessoa";
$a[] = "Porto Alegre";
$a[] = "Sao paulo";
$a[] = "Rio de janeiro";
$a[] = "Salvador";
$a[] = "Belem";
$a[] = "Baixa do Meio";
$a[] = "Florianoplis";
$a[] = "joao camara";
$a[] = "Diogo lopes";
$a[] = "Alto do rodrigues";
$a[] = "pendencias";

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

<?php
// Array with names
$a[] = "Alcanorte";
$a[] = "Brasilia";
$a[] = "Curais novos";
$a[] = "Diogo Lopes";
$a[] = "Espirito Santo";
$a[] = "Floripa";
$a[] = "Guamare";
$a[] = "Holambra";
$a[] = "India";
$a[] = "Pendencias";
$a[] = "Alto do Rodrigues";
$a[] = "Pureza";

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

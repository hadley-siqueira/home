<?php
// Array with names
$a[] = "Macau";
$a[] = "Natal";
$a[] = "Salvador";
$a[] = "João Pessoa";
$a[] = "Fortaleza";
$a[] = "Floripa";
$a[] = "São Paulo";
$a[] = "Rio de Janeiro";
$a[] = "Mossoro";
$a[] = "João Câmara";
$a[] = "Pendências";
$a[] = "Alto do Rodrigues";
$a[] = "Diogo Lopes";
$a[] = "Barreiras";


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

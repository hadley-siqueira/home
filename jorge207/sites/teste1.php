<?php
// Array with names
$a[] = "Argentina";
$a[] = "Britania";
$a[] = "Ceará";
$a[] = "Dinamarca";
$a[] = "Espanha";
$a[] = "Finlândia";
$a[] = "Guamaré";
$a[] = "Havaí";
$a[] = "Ipanguaçu";
$a[] = "Johanesburgo";
$a[] = "Kalifornia";
$a[] = "Londres";
$a[] = "Nepal";
$a[] = "Opala";
$a[] = "Paraíba";
$a[] = "Argelia";
$a[] = "Ratatua";
$a[] = "Ceará-mirim";
$a[] = "Diogo-lopes";
$a[] = "Pernanbuco";
$a[] = "Brasília";
$a[] = "Siracuva";
$a[] = "Inglaterra";
$a[] = "Estados Unidos";
$a[] = "Valentina do norte";
$a[] = "Caiçara do norte";
$a[] = "Natal";
$a[] = "João câmara";
$a[] = "Rio de janeiro";
$a[] = "São paulo";

// get the q parameter from URL
$q = $_REQUEST["q"];

$hint = "";

// lookup all hints from array if $q is different from "" 
if ($q !== "") {
    $q = strtolower($q);
    $len=strlen($q);
    foreach($a as $city) {
        if (stristr($q, substr($city, 0, $len))) {
            if ($hint === "") {
                $hint = $city;
            } else {
                $hint .= ", $city";
            }
        }
    }
}

// Output "no suggestion" if no hint was found or output correct values 
    echo $hint === "" ? "no suggestion" : $hint;
?>

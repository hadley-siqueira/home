<?php
// Array with names
$a[] = "Alto";
$a[] = "Viatina";
$a[] = "Bruxelas";
$a[] = "Floripa";
$a[] = "Bagalore";
$a[] = "Fiorentina";
$a[] = "Paris";
$a[] = "Hege";
$a[] = "Inga";
$a[] = "Johanna";
$a[] = "Kitty";
$a[] = "Linda";
$a[] = "Nina";
$a[] = "Ophelia";
$a[] = "Petunia";
$a[] = "Amanda";
$a[] = "Raquel";
$a[] = "Cindy";
$a[] = "Doris";
$a[] = "Eve";
$a[] = "Evita";
$a[] = "Sunniva";
$a[] = "Tove";
$a[] = "Unni";
$a[] = "Londrina";
$a[] = "Ibiza";
$a[] = "Londres";
$a[] = "Assu";
$a[] = "Baixa";
$a[] = "Macau";

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

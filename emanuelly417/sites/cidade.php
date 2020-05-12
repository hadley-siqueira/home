<?php
$a[] = "Macau";
$a[] = "Pendencias";
$a[] = "Natal";
$a[] = "Parnamirim";
$a[] = "Santa Cruz";
$a[] = "Pau dos Ferros";
$a[] = "Ceara Mirim";
$a[] = "Area Branca";
$a[] = "Sao Paulo do Potengi";
$a[] = "Angicos";
$a[] = "Mossoró";
$a[] = "Caico";
$a[] = "Sao Jose do Mipibu";
// get the q parameter from URL
$q = $_REQUEST["q"];

$hint = "";

// lookup all hints from array if $q is different from "" 
if ($q !== "") {
    $q = strtolower($q);
    $len=strlen($q);
    foreach($a as $cidade) {
        if (stristr($q, substr($cidade, 0, $len))) {
            if ($hint === "") {
                $hint = $cidade;
            } else {
                $hint .= ", $cidade";
            }
        }
    }
}

// Output "no suggestion" if no hint was found or output correct values 
echo $hint === "" ? "no suggestion" : $hint;
?>

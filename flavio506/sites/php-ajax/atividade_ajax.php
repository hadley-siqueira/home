<?php
$a[] = "Alambari";
$a[] = "Birigui";
$a[] = "Cotia";
$a[] = "Dl";
$a[] = "Embu";
$a[] = "Ferroupilha";
$a[] = "Goiania";
$a[] = "Ico";
$a[] = "Jau";
$a[] = "Lages";
$a[] = "Macau";
$a[] = "Natal";
$a[] = "Palmas";
$a[] = "Queimados";
$a[] = "Recife";
$a[] = "Santos";
$a[] = "Timoteo";
$a[] = "Uba";
$a[] = "Vitoria";

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

echo $hint === "" ? "no suggestion" : $hint;
?>

<?php
$a[] = "Assú";
$a[] = "Belo Horizonte";
$a[] = "Currais novos";
$a[] = "Detroid";
$a[] = "Espírito Santo";
$a[] = "Fernando de Noronha";
$a[] = "Governador Dix-sept Rosado";
$a[] = "Houston";
$a[] = "Indiana";
$a[] = "Juiz de Fora";
$a[] = "Kentucky";
$a[] = "Louisiana";
$a[] = "Nebraska";
$a[] = "Ohio";
$a[] = "Pensilvânia";
$a[] = "Rhode Island";
$a[] = "Seatle";
$a[] = "Tennessee";
$a[] = "Utah";
$a[] = "Washington";

$q = $_REQUEST["q"];

$hint = "";
 
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

echo $hint === "" ? "Sem sugestões": $hint;
?>

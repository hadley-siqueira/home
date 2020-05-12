<?php
$a[] = "Macau";
$a[] = "Natal";
$a[] = "Guamaré";
$a[] = "Alto do Rodrigues";
$a[] = "Pendencias";
$a[] = "Brasilia";
$a[] = "Rio de Janeiro";
$a[] = "Nova Natal";
$a[] = "Caico";
$a[] = "Mossoró";
$a[] = "Rosario";
$a[] = "Petropolis";
$a[] = "João Pessoa";
$a[] = "Fernando de Noronha";
$a[] = "Juazeiro";
$a[] = "Tilenoiz";

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

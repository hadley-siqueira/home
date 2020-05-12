<?php
// Array with names
$a[] = "Acará (PA)";
$a[] = "Bacabal (MA)";
$a[] = "Capela de Santana (RS)";
$a[] = "Damolândia (GO)";
$a[] = "Elesbão Veloso (PI)";
$a[] = "Florânia (RN)";
$a[] = "Galinhos (RN)";
$a[] = "Heliópolis (BA)";
$a[] = "Iaras (SP)";
$a[] = "Jaçanã (RN)";
$a[] = "Kaloré (PR)";
$a[] = "Ladainha (MG)";
$a[] = "Macau (RN)";
$a[] = "Natal (RN)";
$a[] = "Olindina (BA)";
$a[] = "Pacaembu (SP)";
$a[] = "Quatá (SP)";
$a[] = "Rebouças (PR)";
$a[] = "São Benedito do Rio Preto (MA)";
$a[] = "Taboleiro Grande (RN)";
$a[] = "Ubiratã (PR)";
$a[] = "Vertente do Lério (PE)";
$a[] = "Wanderlândia (TO)";
$a[] = "Xaxim (SC)";
$a[] = "Zortéa (SC)";


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

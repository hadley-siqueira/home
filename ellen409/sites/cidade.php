<?php
$a[] ="Rio Branco";
$a[] ="Maceió";
$a[] ="Macapá";
$a[] ="Manaus";
$a[] ="Salvador";
$a[] ="Fortaleza";
$a[] ="Brasília";
$a[] ="Vitória";
$a[] ="Goiânia";
$a[] ="São Luís";
$a[] ="Cuiabá";
$a[] ="Campo Grande";
$a[] ="Belo Horizonte";
$a[] ="Belém";
$a[] ="João Pessoa";
$a[] ="Curitiba";
$a[] ="Recife";
$a[] ="Teresina";
$a[] ="Rio de Janeiro";
$a[] ="Natal";
$a[] ="Porto Alegre";
$a[] ="Porto Velho";
$a[] ="Boa Vista";
$a[] ="Florianópolis";
$a[] ="São Paulo";
$a[] ="Aracaju";
$a[] ="Palmas";

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
echo $hint === "" ? "no suggestion" : $hint;

?>

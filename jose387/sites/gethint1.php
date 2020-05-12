<?php
    // Array with names
    $a[] = "Natal";
    $a[] = "Joao Pessoa";
    $a[] = "Recife";
    $a[] = "Fortaleza";
    $a[] = "Teresina";
    $a[] = "Salvador";
    $a[] = "São Luís";
    $a[] = "Maceió";
    $a[] = "Aracaju";
    $a[] = "Manaus";
    $a[] = "Belém";
    $a[] = "Rio Branco";
    $a[] = "Porto Velho";
    $a[] = "Palmas";
    $a[] = "Macapá";
    $a[] = "Boa Vista";
    $a[] = "Sao Paulo";
    $a[] = "Rio de Janeiro";
    $a[] = "Belo Horizonte";
    $a[] = "Vitória";
    $a[] = "Porto Alegre";
    $a[] = "Curitiba";
    $a[] = "Florianópolis";
    $a[] = "Campo Grande";
    $a[] = "Goiania";
    $a[] = "Brasília";
    $a[] = "Cuiaba";

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

<?php
  // Array with cidades
   $a[] = "Juazeiro";
   $a[] = "Aracajú";
   $a[] = "Bahia";
   $a[] = "Jandaira";
   $a[] = "João Câmara";
   $a[] = "Recife";
   $a[] = "China";
   $a[] = "Martins";
   $a[] = "Maranhão";
   $a[] = "Fortaleza";
   $a[] = "Natal";
   $a[] = "Pendências";
   $a[] = "Macau";
   $a[] = "Guamaré";

  // get the q parameter from URL
   $q = $_REQUEST["q"];

   $hint = "";

 // lookup all hints from array if $q is different from "" 
   if ($q !== "") {
    $q = strtolower($q);
    $len=strlen($q);
    foreach($a as $cidades) {
        if (stristr($q, substr($cidades, 0, $len))) {
            if ($hint === "") {
                $hint = $cidades;
            } else {
                $hint .= ", $cidades";
            }
        }
    }
}

 // Output "no suggestion" if no hint was found or output correct values 
 echo $hint === "" ? "no suggestion" : $hint;
?>

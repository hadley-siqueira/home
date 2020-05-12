<?php

$a[] = "Douglas";
$a[] = "Metu";
$x = $_REQUEST  ["q"];
$hint = "";

if ($x !== "") {
    $x = strtolower($x);
    $len=strlen($x);
    foreach($a as $name) {
        if (stristr($x, substr($name, 0, $len))) {
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

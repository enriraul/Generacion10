<?php
// =============================
// Arrays en PHP
// =============================

// Recorriendo con foreach
$colores = ["rojo", "verde", "azul"];
foreach ($colores as $indice => $color) {
    echo "$indice: $color\n";
}

// array_push: agregar al final
$numeros = [1, 2];
array_push($numeros, 3, 4);
print_r($numeros); // [1, 2, 3, 4]

// array_merge: combinar arrays
$a = [1, 2];
$b = [3, 4];
$combinado = array_merge($a, $b);
print_r($combinado); // [1, 2, 3, 4]

// array_map: aplicar función a cada elemento
$nums = [1, 2, 3];
$cuadrados = array_map(fn($n) => $n * $n, $nums);
print_r($cuadrados); // [1, 4, 9]

// array_filter: filtrar por condición
$pares = array_filter($nums, fn($n) => $n % 2 === 0);
print_r($pares); // [2]

// Ejemplo completo
$frutas = ["manzana", "banana", "uva", "pera"];

$frutasMayus = array_map("strtoupper", $frutas);
$frutasConA = array_filter($frutas, fn($f) => strpos($f, "a") !== false);
$todoJunto = implode(", ", $frutasMayus);
echo $todoJunto . "\n";

// Ejercicio integrador
$frases = [
    "PHP es poderoso",
    "Me gusta programar",
    "Estoy aprendiendo PHP"
];

$mayus = array_map("strtoupper", $frases);
$soloPhp = array_filter($frases, fn($f) => stripos($f, "PHP") !== false);
$todoJunto = implode("; ", $frases);

print_r($mayus);
print_r($soloPhp);
echo $todoJunto . "\n";
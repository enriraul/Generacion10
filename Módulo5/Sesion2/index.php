<?
    //operadores

    $a = 10;
    $b = 5;

    //Operadores aritmeticos
    $suma = $a + $b;
    $resta = $a - $b;
    $multiplicacion = $a * $b;
    $division = $a / $b;
    $residuo = $a % $b;

    //Operadores comparativos/relacionales
    $a == $b 
    $a === $b  //Estrictamente igual 
    $a != $b
    $a > $b
    $a < $b

    //Operadores logicos
    $a && $b //and
    $a || $b //or
    !$a //negacion

?>


<?
    //Estructura de control
    #condicional
    if($a){
    }
    else if ($a){
    }
    else{
    }
    #switch
    switch($a){
        case opcion:
            break;
        case opcion2:
            break;
        case opcion3:
            break;
    }
    #Ciclos for
    for($i=1; $i<=5;$i++){

    }

    #Ciclos while
    while($a>=5){

    }
    
    #Ciclos do-while
    do{

    }while(condicional);

?>
<?
    #foreach
    $arreglo = ["ana","pedro","luis"];
    foreach($nombre as $arreglo){

    }
    foreach($arreglo as $indice=> $valor){
        echo $indice, $valor;
    }
?>

<?php

    function nombreFuncion(){
        return 
    }

    $valorRetorno = nombreFuncion();

    // function nombreFuncion2(&$x){

    // }

    function operador($a,$b){
        return $a + $b;
    }
    function($a,$b,$operacion){
        return $operacion($a,$b);
    }
?>
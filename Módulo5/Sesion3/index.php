<?php 
    // $nombre = $_GET['nombre'];
    // echo "<h1>Hola $nombre </h1>";

    if(isset($_GET['nombre'])){ //isset = determinar si una variable se encuentra definida
        $nombre = $_GET['nombre'];
        if($nombre == "Admin"){
            echo "<h1>Bienvenido administrador </h1>";
        }
        else{
            echo "<h1> Hola, $nombre </h1>";
        }
    }
    else{
        echo "<h1>Saludo, visitante</h1>";
    }

?>

<?php
    Class Persona{
        private $nombre;
        private $edad;
        
        public function __construct($nombre,$edad)
        {  
            $this->$nombre = $nombre;
            $this->$edad = $edad; 
        }
        
        public function presentar(){

        }

        public function __destruct()
        {
            echo "elemento destruido";
        }

    }

    Class Empleado extends Persona{
        
    }

?>
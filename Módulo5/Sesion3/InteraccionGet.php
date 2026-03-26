<?php 
    $nombre = $_POST['nombre'] ?? null;
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form method="POST">
        <label>Nombre</label>
        <input type="text" name="nombre" id="nombre">
        <button type="submit">Enviar</button>
    </form>

    <?php if($nombre): ?>
        <?php if($nombre == "Admin"):?>
            <h1>Bienvenido Administrador</h1>
        <?php else: ?>
            <h1>Hola <?php echo $nombre;?></h1>
        <?php endif; ?>
    <?php else: ?>
        <h1>Hola visitante</h1>
    <?php endif; ?>
</body>
</html>
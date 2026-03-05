BEGIN;

CREATE TABLE Cliente(
    idCliente SERIAL PRIMARY KEY,
    nombre varchar(50) NOT NULL,
    correo varchar(50) NOT NULL,
    rol varchar(50)
-- admin/cliente
);

CREATE TABLE Producto(
    idProducto SERIAL PRIMARY KEY,
    nombre varchar(50) NOT NULL,
    categoria varchar(20) NOT NULL,
    precio numeric(10,2) NOT NULL,
    stock integer NOT NULL
);

CREATE TABLE Venta(
    idVenta SERIAL PRIMARY KEY,
    idCliente INTEGER NOT NULL,
    idProducto INTEGER NOT NULL,
    
    CONSTRAINT fk_cliente
        FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente)
        ON UPDATE CASCADE ON DELETE RESTRICT,

    CONSTRAINT fk_producto
        FOREIGN KEY (idProducto) REFERENCES Producto(idProducto)
        ON UPDATE CASCADE ON DELETE RESTRICT
);


COMMIT;
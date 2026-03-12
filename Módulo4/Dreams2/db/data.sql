BEGIN;

INSERT INTO Cliente (nombre, correo) VALUES
('Ana Martínez', 'ana.martinez@example.com'),
('Carlos Pérez', 'carlos.perez@example.com'),
('Lucía Ramírez', 'lucia.ramirez@example.com'),
('Miguel Torres', 'miguel.torres@example.com'),
('Sandra López', 'sandra.lopez@example.com'),
('Jorge Castillo', 'jorge.castillo@example.com'),
('Paola Sánchez', 'paola.sanchez@example.com'),
('Fernando Díaz', 'fernando.diaz@example.com'),
('Mariana Rivas', 'mariana.rivas@example.com'),
('Ricardo Gómez', 'ricardo.gomez@example.com');

INSERT INTO Producto (nombre, categoria, precio, stock) VALUES
('Laptop Lenovo IdeaPad', 'Electrónicos', 14500.00, 12),
('Mouse Logitech M185', 'Electrónicos', 250.00, 50),
('Teclado Redragon K530', 'Electrónicos', 1200.00, 20),
('Monitor Samsung 24"', 'Electrónicos', 3300.00, 15),
('Audífonos Sony WH-CH510', 'Electrónicos', 900.00, 30),

('Silla ergonómica OfficePro', 'Oficina', 2800.00, 10),
('Escritorio de madera 120cm', 'Oficina', 1900.00, 8),
('Lámpara LED escritorio', 'Oficina', 350.00, 40),
('Paquete de hojas A4 (500)', 'Oficina', 120.00, 60),
('Marcadores permanentes (set 8)', 'Oficina', 95.00, 75),

('Balón de fútbol Adidas', 'Deportes', 680.00, 25),
('Guantes de gimnasio', 'Deportes', 250.00, 40),
('Tapete de yoga', 'Deportes', 320.00, 35),
('Raqueta de tenis Wilson', 'Deportes', 2100.00, 12),
('Botella deportiva 1L', 'Deportes', 150.00, 100),

('Cafetera Oster', 'Hogar', 850.00, 18),
('Plancha Philips', 'Hogar', 650.00, 22),
('Ventilador de piso Taurus', 'Hogar', 780.00, 14),
('Juego de sartenes T-Fal', 'Hogar', 950.00, 16),
('Cojín decorativo gris', 'Hogar', 180.00, 40);

COMMIT;
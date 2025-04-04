DROP DATABASE IF EXISTS bases_anuar;
CREATE DATABASE IF NOT EXISTS bases_anuar;
USE bases_anuar;

CREATE TABLE tipo (
    id      INT auto_increment            NOT NULL,
    nombre  VARCHAR(20)     NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE producto (
    id      INT auto_increment             NOT NULL,
    referencia  VARCHAR(20)            NOT NULL,
    nombre  VARCHAR(20)     NOT NULL,
    descripcion   VARCHAR(70)     NOT NULL,
    cantidad      INT  NOT NULL,    
    precio   DOUBLE            NOT NULL,
	descuento   INT            NOT NULL,
	iva   INT            NOT NULL,
    aplicar_dto boolean not null,
    tipo_id int not null,
    PRIMARY KEY (id),
    FOREIGN KEY (tipo_id)  REFERENCES tipo (id)    ON DELETE CASCADE
);

INSERT INTO tipo (nombre) VALUES ('Electrónica');
INSERT INTO tipo (nombre) VALUES ('Ropa');
INSERT INTO tipo (nombre) VALUES ('Alimentos');
INSERT INTO tipo (nombre) VALUES ('Hogar');
INSERT INTO tipo (nombre) VALUES ('Juguetes');
INSERT INTO tipo (nombre) VALUES ('Deportes');
INSERT INTO tipo (nombre) VALUES ('Automotriz');
INSERT INTO tipo (nombre) VALUES ('Herramientas');
INSERT INTO tipo (nombre) VALUES ('Muebles');
INSERT INTO tipo (nombre) VALUES ('Tecnología');

-- Insertar datos en la tabla producto
INSERT INTO producto (referencia, nombre, descripcion, cantidad, precio, descuento, iva, aplicar_dto, tipo_id) 
VALUES ('REF001', 'Laptop', 'Laptop portátil de 15 pulgadas', 10, 800.50, 10, 18, true, 1);

INSERT INTO producto (referencia, nombre, descripcion, cantidad, precio, descuento, iva, aplicar_dto, tipo_id) 
VALUES ('REF002', 'Camiseta', 'Camiseta de algodón talla M', 50, 20.75, 5, 18, true, 2);

INSERT INTO producto (referencia, nombre, descripcion, cantidad, precio, descuento, iva, aplicar_dto, tipo_id) 
VALUES ('REF003', 'Arroz', 'Arroz de grano largo 1kg', 100, 2.50, 0, 18, false, 3);

INSERT INTO producto (referencia, nombre, descripcion, cantidad, precio, descuento, iva, aplicar_dto, tipo_id) 
VALUES ('REF004', 'Silla', 'Silla de oficina ergonómica', 20, 120.00, 15, 18, true, 4);

INSERT INTO producto (referencia, nombre, descripcion, cantidad, precio, descuento, iva, aplicar_dto, tipo_id) 
VALUES ('REF005', 'Muñeca', 'Muñeca de peluche para niños', 30, 15.50, 10, 18, true, 5);

INSERT INTO producto (referencia, nombre, descripcion, cantidad, precio, descuento, iva, aplicar_dto, tipo_id) 
VALUES ('REF006', 'Balón de fútbol', 'Balón de fútbol profesional tamaño 5', 25, 25.00, 5, 18, false, 6);

INSERT INTO producto (referencia, nombre, descripcion, cantidad, precio, descuento, iva, aplicar_dto, tipo_id) 
VALUES ('REF007', 'Aceite motor', 'Aceite para motor de auto 5W-30', 40, 10.99, 5, 18, false, 7);

INSERT INTO producto (referencia, nombre, descripcion, cantidad, precio, descuento, iva, aplicar_dto, tipo_id) 
VALUES ('REF008', 'Destornillador', 'Destornillador de cruz 6 pulgadas', 60, 8.00, 0, 18, true, 8);

INSERT INTO producto (referencia, nombre, descripcion, cantidad, precio, descuento, iva, aplicar_dto, tipo_id) 
VALUES ('REF009', 'Cama', 'Cama de madera tamaño Queen', 10, 250.00, 20, 18, true, 9);

INSERT INTO producto (referencia, nombre, descripcion, cantidad, precio, descuento, iva, aplicar_dto, tipo_id) 
VALUES ('REF010', 'Smartphone', 'Smartphone de 6.5 pulgadas con cámara de 12MP', 20, 350.00, 15, 18, true, 10);


-- create user developer2@localhost identified by 'Decroly00';



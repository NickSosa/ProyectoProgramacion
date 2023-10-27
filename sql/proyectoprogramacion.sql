CREATE DATABASE proyectoprogramacion;
USE proyectoprogramacion;

CREATE TABLE `usuario` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `usuario` (`nombre`, `apellido`, `email`, `telefono`, `password`) VALUES
('Nicolás', 'Sosa', 'ejemplo@yopmail.com', '+54 2612057866', 'contraseñaSegura'),
('María Amelia', 'Correa', 'ejemplo2@hotmail.com', '+54 2653780954', 'ContraseñaLarga'),
('Héctor', 'Sosa', 'ContraseñaLarga', '+54 236579864', 'ContraseñaDeAcceso');

CREATE TABLE `cliente` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `cumpleaños` date DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `cliente` (`nombre`, `apellido`, `email`, `telefono`, `direccion`, `cumpleaños`) VALUES
('Nicolás', 'Sosa', 'ejemplo@yopmail.com', '+54 2612057866', 'Barrio Los Guindos, C Bermejo 1947, Capilla del Rosario, Guaymallén', '2002-03-11'),
('Cynthia', 'Sosa', 'cynthiasosa@hotmail.com', '+54 234768901', 'Barrio Z, Calle X 2325, Localidad C, Guaymallén', '1989-06-02'),
('Pablo', 'Nello', 'pabloNello@gmail.com', '+54 2232245627', 'Barrio A, Calle S 3445, Localidad D, Las Heras', '1987-03-09'),
('Alexandra', 'Sosa', 'alesosa@hotmail.com', '+54 2457891323', 'Barrio Q, Calle W 2234, Localidad E, Luján', '1990-10-23');

SELECT * FROM `usuario`;
SELECT * FROM `cliente`;
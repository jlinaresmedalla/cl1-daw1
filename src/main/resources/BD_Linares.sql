CREATE DATABASE bd_linares;

USE bd_linares;

CREATE TABLE tipo (
    cod_tipo_atencion INT PRIMARY KEY,
    nom_tipo_atencion VARCHAR(255) NOT NULL,
    precio DECIMAL(10, 2) NOT NULL
);

INSERT INTO tipo (cod_tipo_atencion, nom_tipo_atencion, precio) VALUES 
(1, 'Consulta General', 50.00),
(2,'Especialista', 100.00),
(3,'Emergencia', 150.00);

CREATE TABLE atencion (
    num_atencion INT PRIMARY KEY,
    fecha DATE NOT NULL,
    nom_paciente VARCHAR(255) NOT NULL,
    cod_tipo_atencion INT,
    FOREIGN KEY (cod_tipo_atencion) REFERENCES tipo(cod_tipo_atencion)
);
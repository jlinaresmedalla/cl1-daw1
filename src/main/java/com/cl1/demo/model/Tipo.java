package com.cl1.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "tipo")
public class Tipo {

    @Id
    private int cod_tipo_atencion;
    private String nom_tipo_atencion;
    private double precio;

}
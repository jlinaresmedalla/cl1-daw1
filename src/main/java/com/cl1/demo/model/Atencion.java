package com.cl1.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Data
@Table(name = "atencion")
public class Atencion {

    @Id
    private int num_atencion;
    private Date fecha;
    private String nom_paciente;
    private int cod_tipo_atencion;

    @ManyToOne
    @JoinColumn(name = "cod_tipo_atencion", referencedColumnName = "cod_tipo_atencion",insertable = false, updatable = false)
    private Tipo tipo;

}
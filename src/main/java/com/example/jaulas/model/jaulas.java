package com.example.jaulas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor



@Entity
@Table(name = "jaulas")
public class jaulas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "centro_id", nullable = false)
    private Integer centroId; 

    @Column(name = "codigo_jaula", nullable = false, length = 20)
    private String codigoJaula; 
    @Column(name = "estado", nullable = false, length = 30)
    private String estado; 
}
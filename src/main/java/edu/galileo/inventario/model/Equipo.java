package edu.galileo.inventario.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="Equipo")
@Data
public class Equipo {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    @Column
    private String nombre;
    @Column
    private String usuario;
    @Column
    private String departamento;
    @Column
    private String servicetag;
}

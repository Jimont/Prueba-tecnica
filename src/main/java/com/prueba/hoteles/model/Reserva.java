package com.prueba.hoteles.model;

import javax.persistence.*;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "reservas")
@Getter
@Setter
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hotel")
    private Integer idHotel;

    @Column(name = "id_tipo_habitacion")
    private Integer idTipoHabitacion;

    @Column(name = "cant_personas")
    private Integer cantPersonas;

    @Column(name = "fecha_inicio")
    private Date fechaInicio;

    @Column(name = "fecha_fin")
    private Date fechaFin;

    @Column(name = "disponibilidad")
    private String disponibilidad;

    private Integer temporada;

    private Integer tarifa;

}

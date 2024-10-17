package com.example.hotel.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Reclamation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;

    @ManyToOne
    @JoinColumn(name="id_reservation")
    private Reservation reservation;
}

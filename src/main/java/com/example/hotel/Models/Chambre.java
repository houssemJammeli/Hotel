package com.example.hotel.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;

    @OneToMany(mappedBy = "chambre", cascade = CascadeType.REMOVE)
    private List<Reservation> reservations;
}

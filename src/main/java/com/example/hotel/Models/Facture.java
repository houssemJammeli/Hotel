package com.example.hotel.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;

    @OneToOne(mappedBy = "facture", cascade = CascadeType.REMOVE)
    private Reservation reservation;
}

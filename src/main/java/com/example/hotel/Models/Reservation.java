package com.example.hotel.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;


    @ManyToOne
    @JoinColumn(name="id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name="id_chambre")
    private Chambre chambre;

    @OneToMany(mappedBy = "reservation", cascade = CascadeType.REMOVE)
    private List<Reclamation> reclamations;

    @OneToOne
    @JoinColumn(name= "id_facture")
    private Facture facture;

    @OneToMany(mappedBy = "reservation", cascade = CascadeType.REMOVE)
    private List<Service_reservation> S_R;

    @OneToMany(mappedBy = "reservation", cascade = CascadeType.REMOVE)
    private List<Event_reservation> E_R;
}

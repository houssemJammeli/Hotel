package com.example.hotel.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;

    @OneToMany(mappedBy = "event", cascade = CascadeType.REMOVE)
    private List<Event_reservation> E_R;
}

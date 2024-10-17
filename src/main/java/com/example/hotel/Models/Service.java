package com.example.hotel.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;

    @OneToMany(mappedBy = "service", cascade = CascadeType.REMOVE)
    private List<Service_reservation> S_R;


}

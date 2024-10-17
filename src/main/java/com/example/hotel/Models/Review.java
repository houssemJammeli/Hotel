package com.example.hotel.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;

    @ManyToOne
    @JoinColumn(name="id_user")
    private User user;
}

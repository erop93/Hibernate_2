package com.egor.domain;

import jakarta.persistence.*;

@Entity
@Table(schema = "movie", name = "staff")
public class Staff {
    @Id
    @Column(name = "inventory_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;
}

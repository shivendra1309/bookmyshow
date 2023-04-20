package com.thetechniciansteam.bookmyshow.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Theatre")
public class Theatre {

    @Id
    @Column(name = "theatre_id")
    private String theatreId;

    @Column(name="theatre_name")
    private String theatreName;

    @Column(name="address")
    private String address;

    @Column(name="screens")
    private String screens;


}

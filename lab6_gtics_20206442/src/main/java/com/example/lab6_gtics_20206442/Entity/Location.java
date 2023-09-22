package com.example.lab6_gtics_20206442.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "location")
public class Location {

    @Id
    @Column(name = "LocationID")
    private Integer LocationID;

    @Column(name = "City")
    private String City;

    @Column(name = "Country")
    private String Country;



}

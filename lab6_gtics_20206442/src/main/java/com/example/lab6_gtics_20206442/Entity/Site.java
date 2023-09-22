package com.example.lab6_gtics_20206442.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "site")
public class Site {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SiteID")
    private Integer SiteID;

    @Column(name = "SiteName")
    private String SiteName;

    @ManyToOne
    @JoinColumn(name = "LocationID")
    private Location LocationID;

    @Column(name = "InstallationDate")
    private LocalDate InstallationDate;

    @Column(name = "Latitude")
    private String Latitude;

    @Column(name = "Longitude")
    private String Longitude;
}

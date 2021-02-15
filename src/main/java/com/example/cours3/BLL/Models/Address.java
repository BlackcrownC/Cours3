package com.example.cours3.BLL.Models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address implements Serializable {
    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long addressId;

    @Column(name = "address")
    private String address;

    @Column(name = "address2")
    private String address2;

    @Column(name = "district")
    private String district;

    @ManyToOne
    @JoinColumn(name = "city_id", referencedColumnName = "city_id")
    private City city;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "phone")
    private String phone;

    @Column(name = "location")
    private byte[] location;

    @Column(name = "last_update")
    private java.sql.Timestamp lastUpdate;
}

package com.example.cours3.BLL.Models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "staff")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Staff implements Serializable {
    @Id
    @Column(name = "staff_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long staffId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private Address address;

    @Column(name = "picture")
    private long picture;

    @Column(name = "email")
    private String email;

    @OneToOne
    @JoinColumn(name = "store_id", referencedColumnName = "store_id")
    private Store store;

    @Column(name = "active")
    private Byte active;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "last_update")
    private java.sql.Timestamp lastUpdate;
}

package com.example.cours3.BLL.Models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "city")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class City implements Serializable {
    @Id
    @Column(name = "city_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cityId;

    @Column(name = "city")
    private String city;

    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "country_id")
    private Country country;

    @Column(name = "last_update")
    private java.sql.Timestamp lastUpdate;
}

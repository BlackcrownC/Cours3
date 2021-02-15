package com.example.cours3.BLL.Models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "country")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Country implements Serializable {
    @Id
    @Column(name = "country_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long countryId;

    @Column(name = "country")
    private String country;

    @Column(name = "last_update")
    private java.sql.Timestamp lastUpdate;
}

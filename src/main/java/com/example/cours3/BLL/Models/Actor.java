package com.example.cours3.BLL.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "actor")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Actor implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long actorId;

    @Column(name = "first_name")
    @Size(min = 3, max = 50)
    private String firstName;

    @Column(name = "last_name")
    @Size(min = 3, max = 50)
    private String lastName;

    @Column(name = "last_update")
    private java.sql.Timestamp lastUpdate;
}

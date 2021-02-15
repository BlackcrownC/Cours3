package com.example.cours3.BLL.Models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "store")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Store implements Serializable {
    @Id
    @Column(name = "store_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long storeId;

    @Column(name = "manager_staff_id")
    private long managerStaffId;

    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private Address address;

    @Column(name = "last_update")
    private java.sql.Timestamp lastUpdate;
}

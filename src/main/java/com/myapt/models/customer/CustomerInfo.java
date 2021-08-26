package com.myapt.models.customer;


import lombok.Data;

import javax.persistence.*;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "CUSTOMERINFO")
public @Data class CustomerInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @NotNull
    private Long customerId;

    @Column(name="email")
    @NotNull
    private String email;

    @Column(name="first_name")
    @NotNull
    private String firstName;

    @Column(name="last_name")
    @NotNull(message = "last name cannot be empty")
    private String lastName;

    @Column(name="phone_number")
    @NotNull
    private String phoneNumber;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "CUSTOMERINFO_ID")
    private List<Address> address;

}
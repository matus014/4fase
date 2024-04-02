package com.senai.pets.entities;

import com.senai.pets.entities.enums.UserStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User {
    @Id
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;
    private String phone;
    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;

    @OneToOne(optional = true)
    private Address address;
}

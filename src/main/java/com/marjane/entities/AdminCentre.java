package com.marjane.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "AdminCentre")
public class AdminCentre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdAC;

    @Column(name = "Email", unique = true)
    private String Email;

    @Column (name = "Password")
    private String Password;
}

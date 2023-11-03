package com.marjane.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdP;

    @Column(name = "Titre")
    private String Titre;

    @Column(name = "Prix")
    private float Prix;

    @Column(name = "Image")
    private String Image;

    @Column(name = "Description")
    private String Description;

    @ManyToOne
    @JoinColumn(name = "IdCategory",referencedColumnName = "IdC")
    private Category category;
}

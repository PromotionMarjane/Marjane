package com.marjane.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "Category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdC;

    @Column(name = "Titre")
    private String Titre;

    @Column(name = "Description")
    private String Image;

    @OneToMany(mappedBy = "product",fetch = FetchType.EAGER)
    private List<Product> product;

    @OneToOne(mappedBy = "promotion")
    private Promotion promotion;

}

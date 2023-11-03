package com.marjane.entities;

import com.marjane.enums.status;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "Promotion")
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdPr;

    @Column(name = "DateDebut")
    private LocalDateTime DateDebut;

    @Column(name = "DateFin")
    private LocalDateTime DateFin;

    @Enumerated(EnumType.STRING)
    private status status;
}

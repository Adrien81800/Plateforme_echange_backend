package com.again.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String imgUrl;
    private String location;
    private String statut;
    private String etat;
    private String telDonneur;
    private double quantite;
    @OneToOne
    private Categorie categorie;

}
package com.dp.carto.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Materiel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private  String designation;

    @ManyToOne
    private Entite entite;

    @OneToOne
    private Categorie categorie;

    @OneToOne
    private Marque marque;


}

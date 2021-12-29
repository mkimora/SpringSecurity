package com.guissendiaye.SpringSecurity.models;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(	name = "employe" )
public class employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="prenom")
    private String prenom;

    @Column(name="nom")
    private String nom;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(	name = "employe_service",
        joinColumns = @JoinColumn(name = "employe_id"),
        inverseJoinColumns = @JoinColumn(name = "service_id"))
    private Set<Service> services  = new HashSet<>();


    public employee() {
    }

    public employee(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}

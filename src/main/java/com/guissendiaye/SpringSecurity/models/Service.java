package com.guissendiaye.SpringSecurity.models;

import javax.persistence.*;

@Entity
@Table(	name = "service" )
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private EService service;

    public Service() {
    }

    public Service(EService service) {
        this.service = service;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EService getService() {
        return service;
    }

    public void setService(EService service) {
        this.service = service;
    }
}

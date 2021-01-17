package com.example.civetta.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customizations")
public class Customization extends PanacheEntity {

    @ManyToOne
    public Product product;

    public Integer min;

    public Integer max;

    @ManyToOne
    public CustomizationList list;
}

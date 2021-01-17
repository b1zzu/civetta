package com.example.civetta.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class ListItem extends PanacheEntity {

    @ManyToOne
    public CustomizationList list;

    public String name;

    public String description;

    public Float difference;
}

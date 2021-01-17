package com.example.civetta.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "lists")
public class CustomizationList extends PanacheEntity {

    public String name;

    public String description;

    @OneToMany
    public List<ListItem> items;
}

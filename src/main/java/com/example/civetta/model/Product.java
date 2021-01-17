package com.example.civetta.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "products")
public class Product extends PanacheEntity {

    public String name;

    public String description;

    public String image;

    public Float price;

    @OneToMany
    public List<Customization> customizations;
}

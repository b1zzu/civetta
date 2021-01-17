package com.example.civetta.service;

import com.example.civetta.model.Customization;
import com.example.civetta.model.CustomizationList;
import com.example.civetta.model.Product;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomizationService {

    @Transactional
    public Customization createCustomization(Long productId, Integer min, Integer max, Long listID) {
        Customization c = new Customization();
        c.product = Product.findById(productId);
        c.min = min;
        c.max = max;
        c.list = CustomizationList.findById(listID);
        c.persist();
        return c;
    }

    @Transactional
    public Customization updateCustomization(Long id, Integer min, Integer max, Long listID) {
        Customization c = Customization.findById(id);
        c.min = min;
        c.max = max;
        c.list = CustomizationList.findById(listID);
        c.persist();
        return c;
    }

    @Transactional
    public Long deleteCustomization(Long id) {
        Customization.findById(id).delete();
        return id;
    }
}

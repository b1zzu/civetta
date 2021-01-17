package com.example.civetta.resource;

import com.example.civetta.model.Customization;
import com.example.civetta.service.CustomizationService;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;

import javax.inject.Inject;

@GraphQLApi
public class CustomizationResource {

    @Inject
    CustomizationService service;

    @Mutation
    public Customization createCustomization(Long productId, Integer min, Integer max, Long listID) {
        return service.createCustomization(productId, min, max, listID);
    }

    @Mutation
    public Customization updateCustomization(Long id, Integer min, Integer max, Long listID) {
        return service.updateCustomization(id, min, max, listID);
    }

    @Mutation
    public Long deleteCustomization(Long id) {
        return service.deleteCustomization(id);
    }
}

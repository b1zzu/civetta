package com.example.civetta.resource;

import com.example.civetta.model.CustomizationList;
import com.example.civetta.model.ListItem;
import com.example.civetta.service.ListService;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;

import javax.inject.Inject;
import java.util.List;

@GraphQLApi
public class ListResource {

    @Inject
    ListService service;

    @Query("allLists")
    public List<CustomizationList> getAllLists() {
        return CustomizationList.listAll();
    }

    @Mutation
    public CustomizationList createList(String name, String description) {
        return service.createList(name, description);
    }

    @Mutation
    public CustomizationList updateList(Long id, String name, String description) {
        return service.updateList(id, name, description);
    }

    @Mutation
    public Long deleteList(Long id) {
        return service.deleteList(id);
    }

    @Mutation
    public ListItem createItem(Long listID, String name, String description) {
        return service.createItem(listID, name, description);
    }

    @Mutation
    public ListItem updateItem(Long id, String name, String description) {
        return service.updateItem(id, name, description);
    }

    @Mutation
    public Long deleteItem(Long id) {
        return service.deleteItem(id);
    }
}

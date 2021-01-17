package com.example.civetta.service;

import com.example.civetta.model.CustomizationList;
import com.example.civetta.model.ListItem;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
public class ListService {

    @Transactional
    public CustomizationList createList(String name, String description) {
        CustomizationList l = new CustomizationList();
        l.name = name;
        l.description = description;
        l.persist();
        return l;
    }

    @Transactional
    public CustomizationList updateList(Long id, String name, String description) {
        CustomizationList l = CustomizationList.findById(id);
        l.name = name;
        l.description = description;
        return l;
    }

    @Transactional
    public Long deleteList(Long id) {
        CustomizationList.findById(id).delete();
        return id;
    }

    @Transactional
    public ListItem createItem(Long listID, String name, String description) {
        ListItem i = new ListItem();
        i.list = CustomizationList.findById(listID);
        i.name = name;
        i.description = description;
        i.persist();
        return i;
    }

    @Transactional
    public ListItem updateItem(Long id, String name, String description) {
        ListItem i = ListItem.findById(id);
        i.name = name;
        i.description = description;
        i.persist();
        return i;
    }

    @Transactional
    public Long deleteItem(Long id) {
        ListItem.findById(id).delete();
        return id;
    }
}

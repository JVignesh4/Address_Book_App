package com.blz.addressbookapp.model;

import com.blz.addressbookapp.dto.ContactDTO;

public class Contact {
    private String id;

    public Contact(int i, ContactDTO contactDTO) {

    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String name;
}

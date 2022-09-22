package com.blz.addressbookapp.controller;

import com.blz.addressbookapp.model.Contact;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
    @RequestMapping(value = {"", "/", "/get"})
    public String welcomeUser() {
        return "Welcome to address book home";
    }

    @GetMapping("/getContactDetails")
    public String welcomeSpecificUser(@PathVariable String id) {
        return "Welcome, User " + id;
    }

    @PostMapping("/addContactDetails")
    public String createContact(@RequestBody Contact contact) {
        return "Added " + contact.getName() + " to list";
    }

    @PutMapping("/updateContactDetails")
    public String updateContact(@RequestBody Contact contact) {
        return "Updated " + contact.getName() + " in list";
    }

    @DeleteMapping("/deleteContactDetails")
    public String deleteContact(@PathVariable String id) {
        return "Deleted contact " + id;
    }
}

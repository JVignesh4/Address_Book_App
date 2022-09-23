package com.blz.addressbookapp.service;

import com.blz.addressbookapp.dto.ContactDTO;
import com.blz.addressbookapp.model.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {
    @Override
    public List<Contact> getContact() {
        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact(1,
                new ContactDTO("Vignesh", "J", "Kanchipuram", "Tamilnadu", "631501", "8870855565")));
        return contactList;
    }

    @Override
    public Contact getContactById(int contactId) {
        Contact contact = new Contact(1,
                new ContactDTO("Kishore", "Ramesh", "Tamilnadu", "Chennai", "600089", "987654320"));
        return contact;
    }

    @Override
    public Contact createContact(ContactDTO contactDTO) {
        Contact contact = new Contact(1, contactDTO);
        return contact;
    }

    @Override
    public Contact updateContact(int contactId, ContactDTO contactDTO) {
        Contact contact = new Contact(1, contactDTO);
        return contact;
    }

    @Override
    public void deleteContact(int contactId) {

    }
}
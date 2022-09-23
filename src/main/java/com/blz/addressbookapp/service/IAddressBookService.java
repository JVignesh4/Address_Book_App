package com.blz.addressbookapp.service;

import com.blz.addressbookapp.dto.ContactDTO;
import com.blz.addressbookapp.model.Contact;

import java.util.List;

public interface IAddressBookService {
    List<Contact> getContact();

    Contact getContactById(int contactId);

    Contact createContact(ContactDTO contactDTO);

    Contact updateContact(int contactId, ContactDTO contactDTO);

    void deleteContact(int contactId);
}

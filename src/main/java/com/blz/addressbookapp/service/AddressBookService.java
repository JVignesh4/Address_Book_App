package com.blz.addressbookapp.service;

import com.blz.addressbookapp.dto.ContactDTO;
import com.blz.addressbookapp.exception.AddressBookException;
import com.blz.addressbookapp.model.Contact;
import com.blz.addressbookapp.repository.AddressBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService {

    private AddressBookRepository addressBookRepository;
    //List<Contact> contactList = new ArrayList<>();

    @Override
    public List<Contact> getContact() {

        return addressBookRepository.findAll();
    }

    @Override
    public Contact getContactById(int contactId) {
        return addressBookRepository.findById(contactId).orElseThrow(() -> new AddressBookException("Contact of the person "
                + contactId + "doesn't Exist"));
    }

    @Override
    public Contact createContact(ContactDTO contactDTO) {
        Contact contact = null;
        contact = new Contact(contactDTO);
        log.debug("Person Details: " + contact.toString());
        return addressBookRepository.save(contact);
    }

    @Override
    public Contact updateContact(int contactId, ContactDTO contactDTO) {
        Contact contact = this.getContactById(contactId);
        contact.updateContact(contactDTO);
        return addressBookRepository.save(contact);
    }

    @Override
    public void deleteContact(int contactId) {
        Contact contact =this.getContactById(contactId);
        addressBookRepository.delete(contact);
    }
}

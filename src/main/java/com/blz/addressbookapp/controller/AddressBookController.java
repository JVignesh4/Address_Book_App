package com.blz.addressbookapp.controller;

import com.blz.addressbookapp.dto.ContactDTO;
import com.blz.addressbookapp.dto.ResponseDTO;
import com.blz.addressbookapp.model.Contact;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<ResponseDTO> getContactData() {

        Contact contact = new Contact(1,
                new ContactDTO("Vignesh", "J", "Tamilnadu", "Kanchipuram", "631501", "8870855565"));
        ResponseDTO response = new ResponseDTO("Get call success", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }


    @GetMapping("/getContactDetails")
    public ResponseEntity<ResponseDTO> getContactData(@PathVariable("contactId") int contactId) {
        Contact contact = new Contact(1,
                new ContactDTO("Kishore", "Ramesh", "Tamilnadu", "Chennai", "600089", "987654320"));
        ResponseDTO response = new ResponseDTO("Get call success for id", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }


    @PostMapping("/addContactDetails")
    public ResponseEntity<ResponseDTO> addContactData(@RequestBody ContactDTO contactDTO) {
        Contact contact = new Contact(1, contactDTO);
        ResponseDTO response = new ResponseDTO("Created contact data for", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }

    @PutMapping("/updateContactDetails")
    public ResponseEntity<ResponseDTO> updateContactData(@PathVariable("contactId") int contactId,
                                                         @RequestBody ContactDTO contactDTO) {
        Contact contact = new Contact(1, contactDTO);
        ResponseDTO response = new ResponseDTO("Updated contact data for", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }

    @DeleteMapping("/deleteContactDetails")
    public ResponseEntity<ResponseDTO> deleteContactData(@PathVariable("contactId") int contactId) {
        ResponseDTO response = new ResponseDTO("Delete call success for id ", "deleted id:" + contactId);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }
}
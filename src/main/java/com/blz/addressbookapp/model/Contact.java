package com.blz.addressbookapp.model;

import com.blz.addressbookapp.dto.ContactDTO;

import javax.persistence.*;

@Entity
@Table(name = "address_book")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contactId")
    private int contactId;
    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String zip;
    public String phone;

    public Contact(int contactId, ContactDTO contactDTO) {
        this.contactId = contactId;
        this.firstName = contactDTO.firstName;
        this.lastName = contactDTO.lastName;
        this.address=contactDTO.address;
        this.city = contactDTO.city;
        this.state = contactDTO.state;
        this.zip = contactDTO.zip;
        this.phone = contactDTO.phone;
    }

    public Contact() {

    }

    public Contact(ContactDTO contactDTO) {

    }

    public int getContactId() {
        return contactId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void updateContact(ContactDTO contactDTO) {
        this.firstName=contactDTO.firstName;
        this.lastName=contactDTO.lastName;
        this.address=contactDTO.address;
        this.city=contactDTO.city;
        this.state=contactDTO.state;
        this.zip=contactDTO.zip;
        this.phone=contactDTO.phone;
    }
}
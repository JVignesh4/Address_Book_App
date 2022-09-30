package com.blz.addressbookapp.dto;

import lombok.Data;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

@ToString
@Data
public class ContactDTO {
    @Pattern(regexp = "^[A-Z]{1,}[a-zA-z\\s]{2,}$")
    public String firstName;
    @Pattern(regexp = "^[A-Z]{1,}[a-zA-z\\s]{2,}$")
    public String lastName;
    public String address;
    public String city;
    public String state;
    @Pattern(regexp = "^[0-9]{3}\\s{0,1}[0-9]{3}$")
    public String zip;
    @Pattern(regexp = "^^[0-9]{2}?[\\s,-]{0,1}[7-9]{1}[0-9]{9}$")
    public String phone;

    public ContactDTO(String firstName, String lastName, String address, String city, String state, String zip,
                      String phone) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address=address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
    }

}

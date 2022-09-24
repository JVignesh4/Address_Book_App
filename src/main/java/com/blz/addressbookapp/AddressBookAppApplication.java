package com.blz.addressbookapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class AddressBookAppApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book !! ");
        SpringApplication.run(AddressBookAppApplication.class, args);
    }

}

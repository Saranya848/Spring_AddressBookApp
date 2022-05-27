package com.example.addressbookapp.model;

import com.example.addressbookapp.dto.ContactDTO;
import lombok.Data;

@Data
public class Contact {
    private int contactId;
    private String firstName;
    private String lastName;
    private String address;
    private String state;
    private String city;
    private String zip;
    private String phone;

    private String email;
    public Contact(int contactId, ContactDTO contactDTO) {
        super();
        this.contactId = contactId;
        this.firstName = contactDTO.firstName;
        this.lastName = contactDTO.lastName;
        this.address = contactDTO.address;
        this.state = contactDTO.state;
        this.city = contactDTO.city;
        this.zip = contactDTO.zip;
        this.phone = contactDTO.phone;
        this.email = contactDTO.email;
    }
    @Override
    public String toString() {
        return "Contact [contactId=" + contactId + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
                + address + ", state=" + state + ", city=" + city + ", zip=" + zip + ", phone=" + phone + "]";
    }
}

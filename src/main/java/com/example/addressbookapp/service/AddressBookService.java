package com.example.addressbookapp.service;

import com.example.addressbookapp.dto.ContactDTO;
import com.example.addressbookapp.model.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {
    @Override
    public List<Contact> getContact() {
        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact(1,
                new ContactDTO("Harsha", "Sri", "Vizag", "Andhra Pradesh", "Vizag", "523190", "9703170708")));
        System.out.println(contactList.toString());

        return contactList;
    }

    @Override
    public Contact getContactById(int contactId) {
        Contact contact = new Contact(1,
                new ContactDTO("Swathi", "Attada", "Vzm", "Andhra Pradesh", "Vzm", "534198", "9182736450"));
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
        // TODO Auto-generated method stub

    }
}

package com.learn.ag.service;


import com.learn.ag.domain.Contact;

import java.util.List;

/**
 * @author Govorov Andrey
 */
public interface ContactService {

    void addContact(Contact contact);

    List<Contact> listContact();

    void removeContact(Integer id);
}

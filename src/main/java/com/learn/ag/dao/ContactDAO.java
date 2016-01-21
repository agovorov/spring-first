package com.learn.ag.dao;

import com.learn.ag.domain.Contact;

import java.util.List;

/**
 * @author Govorov Andrey
 */
public interface ContactDAO {

    void addContact(Contact contact);

    List<Contact> listContact();

    void removeContact(Integer id);
}

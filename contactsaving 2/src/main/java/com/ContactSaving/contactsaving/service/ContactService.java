package com.ContactSaving.contactsaving.service;

import java.util.List;


import com.ContactSaving.contactsaving.entity.Contact;

public interface ContactService {
	
	public Contact createContact(Contact contact);
	public Contact updateContact(Integer id,Contact contact);
	public List<Contact> getAllContacts();
	public Contact markAsEmergencyContact(Integer id,Contact contact);
	public List<Contact> searchContact(String contactName);

}

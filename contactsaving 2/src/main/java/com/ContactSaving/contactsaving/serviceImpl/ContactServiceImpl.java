package com.ContactSaving.contactsaving.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.ContactSaving.contactsaving.entity.Contact;
import com.ContactSaving.contactsaving.repository.ContactRepo;
import com.ContactSaving.contactsaving.service.ContactService;
@Service
public class ContactServiceImpl implements ContactService{
	@Autowired
	private ContactRepo contactRepo;
	@Override
	public Contact createContact(Contact contact) {
		// TODO Auto-generated method stub
		return contactRepo.save(contact);
	}

	@Override
	public Contact updateContact(Integer id, Contact contact) {
		// TODO Auto-generated method stub
		Contact existingContact=contactRepo.findById(id).orElse(null);
		if (existingContact != null) {
            // Update contact fields
            existingContact.setContactName(contact.getContactName());
            existingContact.setNickname(contact.getNickname());
            existingContact.setJobTitle(contact.getJobTitle());
            existingContact.setEmailAddress(contact.getEmailAddress());
            existingContact.setPhoneNumber(contact.getPhoneNumber());
            existingContact.setNotes(contact.getNotes());
            existingContact.setEducationLevel(contact.getEducationLevel());
            existingContact.setMaritalStatus(contact.getMaritalStatus());
            existingContact.setBusinessContact(contact.isBusinessContact());
            existingContact.setEmergencyContact(contact.isEmergencyContact());
            existingContact.setCategory(contact.getCategory());
            return contactRepo.save(existingContact);
        }
        return null;
	}

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return contactRepo.findAll(Sort.by(Direction.DESC, "emergencyContact"));
	}

	@Override
	public Contact markAsEmergencyContact(Integer id,Contact contact) {
		Contact existingContact=contactRepo.findById(id).orElse(null);
		if (existingContact != null) {
            // Update contact fields
            existingContact.setEmergencyContact(contact.isEmergencyContact());
            return contactRepo.save(existingContact);
        }
        return null;
	}

	@Override
	public List<Contact> searchContact(String contactName) {
		// TODO Auto-generated method stub
		return contactRepo.searchContact(contactName);
	}
}

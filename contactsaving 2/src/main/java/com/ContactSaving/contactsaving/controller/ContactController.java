package com.ContactSaving.contactsaving.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ContactSaving.contactsaving.entity.Contact;
import com.ContactSaving.contactsaving.service.ContactService;
@RestController
@RequestMapping("/api/contact")
public class ContactController {
	
	
	
	 @Autowired
	    private ContactService contactService;
	    
	    @PostMapping("/create")
	    public ResponseEntity<Contact> createContact(@RequestBody Contact contact) {
	        Contact createdContact = contactService.createContact(contact);
	        return new ResponseEntity<>(createdContact,HttpStatus.CREATED);
	    }
	    @PutMapping("/update/{id}")
	    public ResponseEntity<Contact> updateContact(@RequestBody Contact contact,@PathVariable Integer id){
	    	Contact updateContact=this.contactService.updateContact(id, contact);
	    	return new ResponseEntity<>(updateContact, HttpStatus.OK);
	    }
	    @GetMapping("/getAllContacts")
	    public ResponseEntity<List<Contact>> getAllContacts(){
	    	List<Contact> contacts=contactService.getAllContacts();
	    	return new ResponseEntity<>(contacts,HttpStatus.OK);
	    }
	    @PutMapping("/emergency/{id}")
	    public ResponseEntity<Contact> markAsEmergencyContact(@RequestBody Contact contact,@PathVariable Integer id) {
	    	Contact markEmerfencyContact=this.contactService.updateContact(id, contact);
	    	return new ResponseEntity<>(markEmerfencyContact, HttpStatus.OK);
	    }
	    @GetMapping("/search")
	    public ResponseEntity<List<Contact>> searchContact(@RequestParam String contactName){
	    		List<Contact> searchContacts=contactService.searchContact(contactName);
	    		return new ResponseEntity<>(searchContacts,HttpStatus.OK);
	    	}
	    
	    

}

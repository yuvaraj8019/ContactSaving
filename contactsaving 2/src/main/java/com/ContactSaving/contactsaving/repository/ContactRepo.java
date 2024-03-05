package com.ContactSaving.contactsaving.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ContactSaving.contactsaving.entity.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer>{
	@Query("SELECT c FROM Contact c WHERE LOWER(c.contactName) LIKE LOWER(CONCAT('%', :contactName, '%'))")
	public List<Contact> searchContact(@Param("contactName") String  contactName);

}

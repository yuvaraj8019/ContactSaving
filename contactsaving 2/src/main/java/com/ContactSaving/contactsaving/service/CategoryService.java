package com.ContactSaving.contactsaving.service;

import java.util.List;

import com.ContactSaving.contactsaving.entity.Category;
import com.ContactSaving.contactsaving.entity.Contact;

public interface CategoryService {
	
	public Category createCategory(Category category);
	public List<Category>getAllCategories();
	public List<Contact> contacts();

}

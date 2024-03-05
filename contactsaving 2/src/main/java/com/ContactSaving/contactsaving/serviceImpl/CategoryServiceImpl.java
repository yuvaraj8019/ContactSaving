package com.ContactSaving.contactsaving.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ContactSaving.contactsaving.entity.Category;
import com.ContactSaving.contactsaving.entity.Contact;
import com.ContactSaving.contactsaving.repository.CategoryRepo;
import com.ContactSaving.contactsaving.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	private CategoryRepo categoryRepo;

	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> contacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category createCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryRepo.save(category);	}
	
}

package com.ContactSaving.contactsaving.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ContactSaving.contactsaving.entity.Category;
import com.ContactSaving.contactsaving.service.CategoryService;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

	
	@Autowired
	private CategoryService categoryService;
	@PostMapping("/create")
	public ResponseEntity<Category> createCategory(@RequestBody Category category){
		Category createCategory=categoryService.createCategory(category);
		return new ResponseEntity<>(createCategory,HttpStatus.CREATED);
	}
}

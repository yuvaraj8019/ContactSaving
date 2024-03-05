package com.ContactSaving.contactsaving.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ContactSaving.contactsaving.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}

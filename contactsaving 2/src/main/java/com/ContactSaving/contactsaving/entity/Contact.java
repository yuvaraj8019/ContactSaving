package com.ContactSaving.contactsaving.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "contact")
@Getter
@Setter
@NoArgsConstructor
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String contactName;
    private String nickname;
    private String jobTitle;
    private String emailAddress;
    private String phoneNumber;
    private String notes;
    private String educationLevel;
    private String maritalStatus;
    private boolean businessContact;
    private boolean emergencyContact;
    private String category;

    // Constructors, getters, and setters
}

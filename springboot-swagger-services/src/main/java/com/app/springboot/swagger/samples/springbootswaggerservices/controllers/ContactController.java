package com.app.springboot.swagger.samples.springbootswaggerservices.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.springboot.swagger.samples.springbootswaggerservices.model.Contact;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class ContactController {
	
	ConcurrentHashMap<String, Contact> contacts = new ConcurrentHashMap<>();
	Logger logger = Logger.getLogger(ContactController.class.getName());
	
	@GetMapping("/{id}")
	@ApiOperation(value = "Gets a Contact by Id",
				  notes = "Provide an Id to look up for a Contact",
				  response = Contact.class)
	public Contact getContact(@PathVariable String id) {
		return contacts.get(id);
	}
	
	@GetMapping("/")
	public List<Contact> getContacts(){
		return new ArrayList<Contact>(contacts.values());
	}
	
	@PostMapping("/")
	public Contact addContact(@RequestBody Contact contact) {
		contacts.put(contact.getId(), contact);
		return contact;
		
	}

}

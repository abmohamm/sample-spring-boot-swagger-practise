package com.app.springboot.swagger.samples.springbootswaggerservices.model;

import java.util.logging.Logger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

// TODO: Auto-generated Javadoc
/**
 * The Class Contact.
 */
@ApiModel(description = "Details of the Contact")
public class Contact {
	
	/** The id. */
	@ApiModelProperty(notes = "Contact Id")
	private String id;
	
	/** The name. */
	@ApiModelProperty(notes = "Contact name")
	private String name;
	
	/** The phone. */
	@ApiModelProperty(notes = "Contact Number")
	private String phone;
	
	/** The logger. */
	Logger logger = Logger.getLogger(Contact.class.getName());
	
	/**
	 * Instantiates a new contact.
	 */
	public Contact() {
		super();
		logger.info("Contact object created ...");
	}
	
	/**
	 * Instantiates a new contact.
	 *
	 * @param id the id
	 * @param name the name
	 * @param phone the phone
	 */
	public Contact(String id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the phone.
	 *
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Sets the phone.
	 *
	 * @param phone the new phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

}

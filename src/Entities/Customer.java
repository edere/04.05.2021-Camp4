package Entities;

import Abstract.Entity;

public class Customer implements Entity {

	private int id;
	private String firstname;
	private String lastName;
	private String nationalityId;
	private int dateOfBirth;
	
	public Customer() {
		
	}

	public Customer(int id, String firstname, String lastName, String nationalityId, int dateOfBirth) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}

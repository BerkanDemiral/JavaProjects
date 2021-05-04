package Entities;

import java.util.Date;

import Abstract.IEntity;

public class Customer implements IEntity{ // nesnellik zaafiyeti yaþamamak için en baþta implemete ederiz.
	private int id;
	public String firstName;
	public String lastName;
	private Date birthDate;
	private String identityNumber;

	public Customer() {

	}

	public Customer(int id, String firstName, String lastName, Date birthDate, String identityNumber) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.identityNumber = identityNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

}

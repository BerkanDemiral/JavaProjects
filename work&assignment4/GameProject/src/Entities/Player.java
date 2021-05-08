package Entities;

import java.util.Date;

public class Player extends User {
	private String firstName;
	private String lastName;
	private Date birthDate;
	private String identityNumber;


	public Player(int id, String userCode, String firstName, String lastName, Date birthDate, String identityNumber) {
		super(id, userCode);
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.identityNumber = identityNumber;
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

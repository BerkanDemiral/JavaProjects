package Entities;

public class GameProducer extends User {
	private String firsName;
	private String lastName;
	private String descrption;
	
	public GameProducer(int id, String userCode, String firsName, String lastName, String descrption) {
		super(id, userCode);
		this.firsName = firsName;
		this.lastName = lastName;
		this.descrption = descrption;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDescrption() {
		return descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	
	
	
	
}


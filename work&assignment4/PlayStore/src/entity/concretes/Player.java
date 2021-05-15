package entity.concretes;

public class Player extends User {
	private int playerCode;
	private String firstName;
	private String lastName;
	private String birthYear;
	private String identityNumber;
	private boolean isVerifyAccount;

	public Player(int id, String email, String password) {
		super(id, email, password);
	}

	public Player(int id, String email, String password, String firstName, String lastName,
			String birthYear, String identityNumber) {
		super(id, email, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.identityNumber = identityNumber;
	}

	public int getPlayerCode() {
		return playerCode;
	}

	public void setPlayerCode(int playerCode) {
		this.playerCode = playerCode;
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

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public boolean isVerifyAccount() {
		return isVerifyAccount;
	}

	public void setVerifyAccount(boolean isVerifyAccount) {
		this.isVerifyAccount = isVerifyAccount;
	}
	
	
	
}

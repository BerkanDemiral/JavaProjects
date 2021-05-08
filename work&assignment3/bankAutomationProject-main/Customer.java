public class Customer {
    private int id;
    private String name;
    private String surname;
    private int telephoneNumber;
    private String customerCode;
    public String username;
    public String password;

    public Customer(int id, String name, String surname, String username, String password, int telephoneNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.telephoneNumber = telephoneNumber;

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }
    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getCustomerCode() {
		this.customerCode = name.substring(0,1) + surname.substring(0,1) + id;
        return customerCode;
    }


}

public class Account {
    private int id;
    private int bankId;
    private String accountName;
    private int customerId;
    private int balance;
    private String accountOpeningAdress;
    private int accountNumber;

    public Account(int id, int bankId, int customerId, int balance, String accountOpeningAdress, int accountNumber) {
        this.id = id;
        this.bankId = bankId;
        this.customerId = customerId;
        this.balance = balance;
        this.accountOpeningAdress = accountOpeningAdress;
        this.accountNumber = accountNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountOpeningAdress() {
        return accountOpeningAdress;
    }

    public void setAccountOpeningAdress(String accountOpeningAdress) {
        this.accountOpeningAdress = accountOpeningAdress;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
		this.accountName = accountOpeningAdress.substring(0, 2) + customerId;
        return accountName;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }
}

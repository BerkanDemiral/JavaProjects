public class AccountManage {
    public void depositMoney(Customer customer, Account account, int money) {
        account.setBalance(account.getBalance() + money);
        System.out.println(customer.getName() + " müşterisinin " + account.getAccountName() + " hesabının bakiyesi güncellendi.\nYeni Bakiye: " + account.getBalance());
    }

    public void withdrawMoney(Customer customer, Account account, int money) {
        account.setBalance(account.getBalance() - money);
        System.out.println(customer.getName() + " müşterisinin " + account.getAccountName() + " hesabının bakiyesi güncellendi.\nYeni Bakiye: " + account.getBalance());
    }

    public void viewBalance(Customer customer, Account account) {
        System.out.println(customer.getName() + " müşterisinin " + account.getAccountName() + " hesabının güncel bakiyesi: " + account.getBalance());
    }

}

public class Main {

    public static void main(String[] args) {

        //--------------- Reference Definition Processes -------------------


        Bank bank1 = new Bank(1, "HalkBank", "İstabul");
        Bank bank2 = new Bank(2, "İş Bankası", "İstanbul");
        Bank[] banks = {bank1, bank2};

        Customer customer1 = new Customer(1, "Berkan", "Demiral", "berkandemiral", "berkan123", 511212121);
        Customer customer2 = new Customer(2, "Ceylan", "Tekin", "ceylantekin", "ceylan123", 513232323);
        Customer customer3 = new Customer(3, "Deniz", "Aşık", "denizasik", "deniz123", 599456545);
        Customer[] customers = {customer1, customer2, customer3};

        Account account1 = new Account(1, 1, 1, 4500, "Uskudar", 13246587);
        Account account2 = new Account(2, 2, 1, 7200, "Beşiktas", 23156215);
        Account account3 = new Account(3, 1, 2, 18000, "Uskudar", 213654564);
        Account account4 = new Account(4, 1, 1, 1100, "Uskudar", 546879546);
        Account[] accounts = {account1, account2, account3, account4};

        CustomerManage customerManage = new CustomerManage();
        AccountManage accountManage = new AccountManage();

        //---------------- Manage Process ----------------------------

        customerManage.viewCustomerInfo(customer1);
        System.out.println("------------------------------");
        System.out.println(customer1.getName() + " müşterisinin eski parolası: " + customer1.getPassword());
        customerManage.changePassword(customer1, "321berkan321");
        System.out.println(customer1.getName() + " müşterisinin yeni parolası: " + customer1.getPassword());
        System.out.println("------------------------------");
        accountManage.viewBalance(customer1, account1);
        accountManage.viewBalance(customer1, account2);
        System.out.println("------------------------------");
        accountManage.depositMoney(customer3, account1, 3750);
        System.out.println("------------------------------");
        accountManage.withdrawMoney(customer3, account1, 1000);


    }
}

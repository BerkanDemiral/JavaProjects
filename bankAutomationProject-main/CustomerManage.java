public class CustomerManage {
    public void viewCustomerInfo(Customer customer) {
        System.out.println("Name Surname: " + customer.getName() + " " + customer.getSurname());
        System.out.println("Telephone Number: " + customer.getTelephoneNumber());
        System.out.println("Customer Code: " + customer.getCustomerCode());

    }

    public void changeCustomerTelephone(Customer customer, int newTelephoneNumber) {
        customer.setTelephoneNumber(newTelephoneNumber);
        System.out.println(customer.getName() + " kullanıcısnın telefon numarası değiştirildi.");
    }

    public void changePassword(Customer customer, String newPassword) {
        customer.setPassword(newPassword);
        System.out.println(customer.getName() + " kullanıcısının parolası değiştiridi");
    }


}

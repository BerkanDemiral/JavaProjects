public class StudentCreditManager extends CreditManager{
    public double calculate(double amount){
        return amount + amount*0.11;
    }
}

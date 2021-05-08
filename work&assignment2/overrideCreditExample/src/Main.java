public class Main {

    public static void main(String[] args) {
	    CreditManager creditManager = new CreditManager();
	    CreditManager[] creditManagers = {new StudentCreditManager(),
                new TeacherCreditManager(),
                new AgricultureCreditManager()};

	    for(CreditManager menager: creditManagers){
			System.out.println(menager.calculate(1000));
        }
    }
}

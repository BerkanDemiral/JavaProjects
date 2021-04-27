public class Main {

    public static void main(String[] args) {
        FourOperations fourOperations = new FourOperations();
        System.out.println("Addition: "+ fourOperations.addition(4,7,11,23));
        System.out.println("Extraction: "+fourOperations.extraction(21,10,8));
        System.out.println("Multiplication: "+fourOperations.multiplication(5,10,2));
        System.out.println("Division: "+fourOperations.division(16,9));
    }
}


//-----------------------------------------------

public class FourOperations {
    public int addition(int... number) {
        int total = 0;
        for (int counter : number) {
            total += counter;
        }
        return total;
    }

    public int extraction(int... number) {
        int total = 0;
        for (int counter : number) {
            total -= counter;
        }
        return total;
    }

    public int multiplication(int... number) {
        int total = 1;
        for (int counter : number) {
            total*= counter;
        }
        return total;
    }

    public double division(double number1, double number2) {
        double total = number1/number2;
        return total;
    }
}

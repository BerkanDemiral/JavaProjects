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

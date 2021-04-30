import java.util.Scanner;

// berkand.
public class Main {

    public static void main(String[] args) {
        // info!!! 220 and 284 are friend number

        Scanner scan = new Scanner(System.in);
        System.out.print("Number 1: ");
        int number1 = scan.nextInt();
        System.out.print("Number2: ");
        int number2 = scan.nextInt();

        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                total1 += i;
            }
        }
        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                total2 += i;
            }
        }

        if (total1 == number2 && total2 == number1) {
            System.out.println("Your numbers are friends numbers");
        } else {
            System.out.println("Your numbers aren't friends numbers");
        }
    }
}

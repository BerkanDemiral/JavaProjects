import java.util.Scanner;
//berkandemiral
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi1: ");
        int sayi1 = scan.nextInt();
        System.out.print("Sayi2: ");
        int sayi2 = scan.nextInt();
        System.out.print("Sayi3: ");
        int sayi3 = scan.nextInt();

        int enbuyuk = sayi1;

        if (enbuyuk < sayi2) {
            enbuyuk = sayi2;
        }
        if (enbuyuk < sayi3) {
            enbuyuk = sayi3;
        }

        System.out.println("En büyük sayi: " + enbuyuk);


    }
}

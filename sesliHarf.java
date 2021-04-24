import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sesli harf giriniz(Büyük harf ile): ");
        char harf = scan.next().charAt(0);

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf girdiniz. ");
                break;
            default: // bunların dışındakiler için;
                System.out.println("İnce sesli harf girdiniz. ");
        }
    }
}

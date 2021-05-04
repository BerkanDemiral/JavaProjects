import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi = scan.nextInt();
        int sayac =0 ;
        for(int i=2; i<sayi; i++){
            if(sayi%i == 0){
                sayac++;
            }
        }
        if(sayac == 0){
            System.out.println("SAYI ASALDIR");
        }
        else{
            System.out.println("SAYI ASAL DEĞİLDİR");
        }

    }
}

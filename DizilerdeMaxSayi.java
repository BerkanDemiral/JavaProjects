public class Main {

    public static void main(String[] args) {
        // Dizi tanımlayıp sayıları, toplamlarını ve en büyük sayıyı ekrana yazdıralım
        double[] dizi = {1.7, 2.5, 3.4, 7.1, 5.5, 6.8};
        double total = 0;
        double max = dizi[0];
        for (double i : dizi) { // foreach
            total+=i;
            if(max<i){
                max = i;
            }
            System.out.println(i);
        }
        System.out.println("Sayıların Toplamı: "+total);
        System.out.println("En büyük sayı: "+ max );
    }
}

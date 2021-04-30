import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);

        System.out.println("Eleman Sayısı: "+ mesaj.length());
        System.out.println("5.eleman: "+ mesaj.charAt(4));
        String mesaj2 = mesaj.concat(" Yaşasın");
        System.out.println(mesaj2);

        System.out.println(mesaj.startsWith("B")); // ture döner
        System.out.println(mesaj.endsWith("f")); // false döner

        char[] karakterler = new char[5]; // 4 index 5 eleman
        mesaj.getChars(0,5,karakterler,0);
        // mesajlar içindeki ilk 5 karakteri al, karakterlerin 0.indexinden itibaren yaz.
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("a")); // ilk a karakterinin indexi
        System.out.println(mesaj.lastIndexOf("a")); // sondan başlayarak a görünce indexi

        String mesaj2;
        mesaj2 = mesaj.replace(" ", "-");
        System.out.println(mesaj2);

        System.out.println(mesaj.substring(2,5)); // 2.indexten başla 5'e kadar(gün)
        for(String kelime : mesaj.split(" ")){
            System.out.println(kelime); // boşluğa göre ayır, her ayrılanı println ile yaz.
        }
        System.out.println(mesaj.toLowerCase(Locale.ROOT));
        System.out.println(mesaj.toUpperCase(Locale.ROOT));
        System.out.println(mesaj.trim()); // metnin başında sonunda boşluk varsa kaldırır
    }
}

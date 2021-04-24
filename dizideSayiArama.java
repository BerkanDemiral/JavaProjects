public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean kontrol = false;


        for (int i : sayilar) {
            if (i == aranacak) {
                kontrol = true;

            }
        }
        if (kontrol) {
            System.out.println("Aranacak sayı dizi içerisinde VAR");
        } else {
            System.out.println("Aranacak sayı dizi içerisinde YOK");
        }

    }
}

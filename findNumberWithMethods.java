import java.util.Scanner;

public class Main {

    public static void findNumber(int[]array, int number){
         boolean isThere = false;
         for(int i : array){
             if(i == number){
                 isThere = true;
             }
         }
         if(isThere){
             System.out.println("The number exists in the array");
         }
         else{
             System.out.println("The number not exists int the array");
         }
    }
    public static void main(String[] args) {
	    // Parametre olarak yollanan dizideki, parametre olarak yollanan elemanı bulma

        Scanner scan = new Scanner(System.in);
        int myArray[] = {1,7,13,5,21,8,12,13,17,-5,23};
        System.out.print("Enter a number: ");
        int myNumber = scan.nextInt();

        findNumber(myArray,myNumber);

    }
}

 public class Main {
    public static int totalOfNumbers(int... number){
        int total = 0;
        for(int i : number){
            total+=i;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println("Total of Numbers: "+ totalOfNumbers(1,3,5,7,11,13,21,55,32,21));
    }
}

public class Main {

    public static void main(String[] args) {
        FourOperations fourOperations = new FourOperations();
        System.out.println("Addition: "+ fourOperations.addition(4,7,11,23));
        System.out.println("Extraction: "+fourOperations.extraction(21,10,8));
        System.out.println("Multiplication: "+fourOperations.multiplication(5,10,2));
        System.out.println("Division: "+fourOperations.division(16,9));
    }
}

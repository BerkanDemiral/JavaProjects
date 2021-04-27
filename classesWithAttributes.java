public class Main {

    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Laptop");
        product1.setDescription("16GB RAM");
        product1.setPrice(12500);
        product1.setStockAmount(2);
        product1.setColor("White");

        Product[] products = {product1};

        System.out.println(product1.getCode());
    }
}

// ----------------------------------------------------

public class Product {
    private int id; // _id
    private String name; // _name
    private String description; // _description
    private double price; // _price
    private int stockAmount; // _stockAmount
    private String color; // _color
    private String code; // _code

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }
    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String renk) {
        this.color = renk;
    }

    public String getCode() { // readonly
        return this.name.substring(0,1)+this.id;
    }

}

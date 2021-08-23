public class Product {
    private double price;
    private int quantity;
    private String name;
    public Product(String initialName, double initialPrice, int initialQuality){
        this.price = initialPrice;
        this.quantity = initialQuality;
        this.name = initialName;
    }
    public void printProduct(){
        System.out.println(this.name+", "+this.price+", "+this.quantity+" pcs");
    }
}

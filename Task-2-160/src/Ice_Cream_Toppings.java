public class Ice_Cream_Toppings implements getTotal {
    private String name;
    private double price;
    private int quantity;
    public Ice_Cream_Toppings(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public double initialCalc(){
        return price * quantity;
    }
}

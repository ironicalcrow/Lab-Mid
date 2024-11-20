import java.util.ArrayList;

public class Order {
    private int orderID;
    private double tax= 0.8;
    private ArrayList<Ice_Cream_Flavour> f;
    private ArrayList<Ice_Cream_Toppings> t;
    public Order() {
        f = new ArrayList();
        t = new ArrayList();
    }
    public void addIceCreamFlavour(Ice_Cream_Flavour order) {
        this.f.add(order);
    }
    public void addIceCreamToppings(Ice_Cream_Toppings order) {
        this.t.add(order);
    }
    public double price()
    {
        double sum=0;
        for(Ice_Cream_Flavour i : f)
        {
            sum= i.initialCalc();
        }
        for(Ice_Cream_Toppings t : t)
        {
            sum= t.initialCalc();
        }
        return sum*tax;
    }


}

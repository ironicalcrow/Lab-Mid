import java.util.ArrayList;

public class Order {
    private int orderID=0;
    private double tax= 0.8;
    private ArrayList<Ice_Cream_Flavour> f;
    private ArrayList<Ice_Cream_Toppings> t;
    public Order() {
        orderID++;
        f = new ArrayList();
        t = new ArrayList();
    }

    public void addIceCreamFlavour(Ice_Cream_Flavour order) {
        this.f.add(order);
    }
    public void addIceCreamToppings(Ice_Cream_Toppings order) {
        this.t.add(order);
    }

    public int getOrderID() {
        return orderID;
    }

    public Ice_Cream_Flavour getT(int index) {
        return f.get(index);
    }
    public Ice_Cream_Toppings getF(int index) {
        return t.get(index);
    }

    public double price()
    {
        double sum=0;
        for(Ice_Cream_Flavour i : f)
        {
            sum= i.initialCalc();
        }
        for(Ice_Cream_Toppings i : t)
        {
            sum= i.initialCalc();
        }
        return sum;
    }
    public double SubTotal()
    {
        double sum= price();
        return sum*tax+sum;
    }
    public int orderICFsize()
    {
        return f.size();
    }
    public int orderICTsize()
    {
        return t.size();
    }
    public double getTax()
    {
        return tax*price();
    }


}

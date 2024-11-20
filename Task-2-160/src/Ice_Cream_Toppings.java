public class Ice_Cream_Toppings extends Eatable {

    public Ice_Cream_Toppings(String name, int quantity) {
        super(name,quantity);
    }
    public void ICtobjectCreator(String name, int quantity) {
        Ice_Cream_Toppings ice_cream_toppings = new Ice_Cream_Toppings(name, quantity);
        PriceSetter.priceSetter(ice_cream_toppings);
    }

}

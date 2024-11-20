public class Ice_Cream_Flavour extends Eatable {
    public Ice_Cream_Flavour(String name, int quantity) {
        super(name,quantity);
    }

    public void ICFobjectCreator(String name, int quantity) {
        Ice_Cream_Flavour ice_cream_flavour = new Ice_Cream_Flavour(name, quantity);
        PriceSetter.priceSetter(ice_cream_flavour);
    }

}


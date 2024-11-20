public class PriceSetter {
    public static void priceSetter(Eatable e)
    {
        String name= e.getName();
        switch(name)
        {
            case "Mint Chocolate Chip":
                e.setPrice(2.80);
                break;
            case "Chocolate Fudge":
                e.setPrice(3.00);
                break;
            case "Strawberry Swirl":
                e.setPrice(2.75);
                break;
            case "Pistachio Delight":
                e.setPrice(3.25);
                break;
            case "Sprinkles":
                e.setPrice(0.30);
                break;
            case "Marshmallow":
                e.setPrice(0.70);
                break;
            case "Crushed oreo":
                e.setPrice(0.85);
                break;
            case "Fresh Strawberries":
                e.setPrice(0.90);
                break;
            case "Chocolate Chips":
                e.setPrice(0.50);
                break;
        }
    }

}

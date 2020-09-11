public class SimpleSandwichFactory {
    public Sandwich createSandwich(String type) {
        Sandwich sandwich = null;

        if (type.equals("BLT")) {
            sandwich = new BLTSandwich();
        } else if (type.equals("meatball")) {
            sandwich = new MeatballSandwich();
        } else if (type.equals("BBQ")) {
            sandwich = new BBQSandwich();
        } else if (type.equals("chicken")) {
            sandwich = new ChickenSandwich();
        }
        return sandwich;
    }

}
public class Footlong {
    public Deli createSandwich(type) {
        if (type.equals("BLT")) {
            sandwich = new FLBLTSandwich();
        } else if (type.equals("meatball")) {
            sandwich = new FLMeatballSandwich();
        } else if (type.equals("BBQ")) {
            sandwich = new FLBBQSandwich();
        } else if (type.equals("chicken")) {
            sandwich = new FLChickenSandwich();
        }
    }
    
}

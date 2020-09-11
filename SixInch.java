public class SixInch {
    public Deli createSandwich(type) {
        if (type.equals("BLT")) {
            sandwich = new SIBLTSandwich();
        } else if (type.equals("meatball")) {
            sandwich = new SIMeatballSandwich();
        } else if (type.equals("BBQ")) {
            sandwich = new SIBBQSandwich();
        } else if (type.equals("chicken")) {
            sandwich = new SIChickenSandwich();
        }
    }
        
}

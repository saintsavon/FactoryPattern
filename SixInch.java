public class SixInch extends Deli {

    protected Sandwich createSandwich(String item) {
        Sandwich sandwich = null;
        SandwichIngredientFactory ingredientFactory = new SixInchIngredientFactory();

        if (item.equals("bacon")) {
            sandwich = new SIBLTSandwich(ingredientFactory());
            sandwich.setName("Six Inch BLT Sandwich")
        } else if (item.equals("meatball")) {
            sandwich = new SIMeatballSandwich(ingredientFactory));
            sandwich.setName("Six Inch Meatball Sandwich")
        } else if (item.equals("BBQ")) {
            sandwich = new SIBBQSandwich(ingredientFactory());
            sandwich.setName("Six Inch BBQ Sandwich")
        } else if (item.equals("chicken")) {
            sandwich = new SIChickenSandwich(ingredientFactory());
            sandwich.setName("Six Inch Chicken Sandwich")
        }
        return sandwich;
    }
    
}

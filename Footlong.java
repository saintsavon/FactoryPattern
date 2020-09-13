public class Footlong extends Deli {

    protected Sandwich createSandwich(String item) {
        Sandwich sandwich = null;
        SandwichIngredientFactory ingredientFactory = new FootlongIngredientFactory();

        if (item.equals("bacon")) {
            sandwich = new BLTSandwich(ingredientFactory());
            sandwich.setName("Footlong BLT Sandwich")
        } else if (item.equals("meatball")) {
            sandwich = new FLMeatballSandwich(ingredientFactory));
            sandwich.setName("Footlong Meatball Sandwich")
        } else if (item.equals("BBQ")) {
            sandwich = new FLBBQSandwich(ingredientFactory());
            sandwich.setName("Footlong BBQ Sandwich")
        } else if (item.equals("chicken")) {
            sandwich = new FLChickenSandwich(ingredientFactory());
            sandwich.setName("Footlong Chicken Sandwich")
        }
        return sandwich;
    }
    
}

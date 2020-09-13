public class Footlong extends Deli {

    protected Sandwich createSandwich(String item) {
        Sandwich sandwich = null;
        SandwichIngredientFactory ingredientFactory = new FootlongIngredientFactory();

        if (item.equals("bacon")) {
            sandwich = new BLTSandwich(ingredientFactory());
            sandwich.setName("Footlong BLT Sandwich")
        } else if (item.equals("meatball")) {
            sandwich = new MeatballSandwich(ingredientFactory));
            sandwich.setName("Footlong Meatball Sandwich")
        } else if (item.equals("BBQ")) {
            sandwich = new BBQSandwich(ingredientFactory());
            sandwich.setName("Footlong BBQ Sandwich")
        } else if (item.equals("chicken")) {
            sandwich = new ChickenSandwich(ingredientFactory());
            sandwich.setName("Footlong Chicken Sandwich")
        }
        return sandwich;
    }
    
}

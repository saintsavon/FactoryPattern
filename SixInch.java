public class SixInch extends Deli {

    protected Sandwich createSandwich(String item) {
        Sandwich sandwich = null;
        SandwichIngredientFactory ingredientFactory = new SixInchIngredientFactory();

        if (item.equals("bacon")) {
            sandwich = new BLTSandwich(ingredientFactory());
            sandwich.setName("Six Inch BLT Sandwich");
        } else if (item.equals("meatball")) {
            sandwich = new MeatballSandwich(ingredientFactory);
            sandwich.setName("Six Inch Meatball Sandwich");
        } else if (item.equals("BBQ")) {
            sandwich = new BBQSandwich(ingredientFactory());
            sandwich.setName("Six Inch BBQ Sandwich");
        } else if (item.equals("chicken")) {
            sandwich = new ChickenSandwich(ingredientFactory());
            sandwich.setName("Six Inch Chicken Sandwich");
        }
        return sandwich;
    }

    private SandwichIngredientFactory ingredientFactory() {
        return null;
    }
    
}

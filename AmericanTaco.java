public class AmericanTaco extends TacoStand {

    protected Taco createTaco(String item) {
        Taco taco = null;
        TacoIngredientFactory ingredientFactory = new AmericanTacoIngredientFactory();

        if (item.equals("bacon")) {
            taco = new BLTTaco(ingredientFactory);
            taco.setName("Six Inch BLT Taco");
        } else if (item.equals("meatball")) {
            taco = new MeatballTaco(ingredientFactory);
            taco.setName("Six Inch Meatball Taco");
        } else if (item.equals("BBQ")) {
            taco = new BBQTaco(ingredientFactory);
            taco.setName("Six Inch BBQ Taco");
        } else if (item.equals("chicken")) {
            taco = new ChickenTaco(ingredientFactory);
            taco.setName("Six Inch Chicken Taco");
        }
        return taco;
    }

}

public class AmericanTaco extends TacoStand {

    protected Taco createTaco(String item) {
        Taco taco = null;
        TacoIngredientFactory ingredientFactory = new AmericanTacoIngredientFactory();

        if (item.equals("chicken")) {
            taco = new ChickenTaco(ingredientFactory);
            taco.setName("Chicken American Taco");
        } else if (item.equals("goat")) {
            taco = new GoatTaco(ingredientFactory);
            taco.setName("Goat American Taco");
        }
        return taco;
    }

}

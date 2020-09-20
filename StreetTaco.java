public class StreetTaco extends TacoStand {

    protected Taco createTaco(String item) {
        Taco taco = null;
        TacoIngredientFactory ingredientFactory = new StreetTacoIngredientFactory();

        if (item.equals("bacon")) {
            taco = new BLTTaco(ingredientFactory);
            taco.setName("Footlong BLT Taco");
        } else if (item.equals("meatball")) {
            taco = new MeatballTaco(ingredientFactory);
            taco.setName("Footlong Meatball Taco");
        } else if (item.equals("BBQ")) {
            taco = new BBQTaco(ingredientFactory);
            taco.setName("Footlong BBQ Taco");
        } else if (item.equals("chicken")) {
            taco = new ChickenTaco(ingredientFactory);
            taco.setName("Footlong Chicken Taco");
        }
        return Taco;
    }
    
}

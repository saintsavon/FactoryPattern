public class StreetTaco extends TacoStand {

    protected Taco createTaco(String item) {
        Taco taco = null;
        TacoIngredientFactory ingredientFactory = new StreetTacoIngredientFactory();

   
        if (item.equals("chicken")) {
            taco = new ChickenTaco(ingredientFactory);
            taco.setName("Chicken Street Taco");
        } else if (item.equals("goat")) {
            taco = new GoatTaco(ingredientFactory);
            taco.setName("Goat Street Taco");
        }
        return taco;
    }
    
}

public class GoatTaco extends Taco {
    TacoIngredientFactory ingredientFactory;

    public GoatTaco(TacoIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing your taco: " + name);
        tortilla = ingredientFactory.createTortilla();
        cheese = ingredientFactory.createCheese();
        meat = ingredientFactory.createMeat();
        veggies = ingredientFactory.createVeggies();
    }
}
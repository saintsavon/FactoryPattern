public class ChickenTaco extends Taco {
    TacoIngredientFactory ingredientFactory;

    public ChickenTaco(TacoIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing your taco: " + name);
        tortilla = ingredientFactory.createTortilla();
        cheese = ingredientFactory.createCheese();
        meat = ingredientFactory.createMeat();
        salsa = ingredientFactory.createSalsa();
        veggies = ingredientFactory.createVeggies();
    }
}
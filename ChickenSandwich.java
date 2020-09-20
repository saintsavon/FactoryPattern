public class ChickenSandwich extends Taco {
    TacoIngredientFactory ingredientFactory;

    public ChickenSandwich(TacoIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing your sandwich: " + name);
        tortilla = ingredientFactory.createTortilla();
        cheese = ingredientFactory.createCheese();
        meat = ingredientFactory.createMeat();
    }
}
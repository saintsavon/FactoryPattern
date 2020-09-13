public class FLBBQSandwich extends Sandwich {
    SandwichIngredientFactory ingredientFactory;

    public FLBLTSandwich(SandwichIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing your sandwich: " + name);
        bread = ingredientFactory.createBread();
        cheese = ingredientFactory.createCheese();
        meat = ingredientFactory.createMeat();
    }
}
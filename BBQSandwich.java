public class BBQSandwich extends Sandwich {
    SandwichIngredientFactory ingredientFactory;

    public BBQSandwich(SandwichIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing your sandwich: " + name);
        bread = ingredientFactory.createBread();
        cheese = ingredientFactory.createCheese();
        meat = ingredientFactory.createMeat();
    }
}
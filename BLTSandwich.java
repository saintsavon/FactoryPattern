public class BLTSandwich extends Sandwich {
    SandwichIngredientFactory ingredientFactory;

    public BLTSandwich(SandwichIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing your sandwich: " + name);
        bread = ingredientFactory.createBread();
        cheese = ingredientFactory.createCheese();
        meat = ingredientFactory.createMeat();
        veggies[] = ingredientFactory.createVeggies();
    }
}
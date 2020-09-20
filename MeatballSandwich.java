public class MeatballSandwich extends Sandwich {
    TacoIngredientFactory ingredientFactory;

    public MeatballSandwich(TacoIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing your sandwich: " + name);
        bread = ingredientFactory.createBread();
        cheese = ingredientFactory.createCheese();
        meat = ingredientFactory.createMeat();
    }
}
public interface SandwichIngredientFactory {

    public Bread createBread();
    public Cheese createCheese();
    public Meat createMeat();
    public Veggies[] createVeggies();
}